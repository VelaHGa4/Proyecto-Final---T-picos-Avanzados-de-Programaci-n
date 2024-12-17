/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

/**
 *
 * @author Gael
 */
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
import java.io.*;
import java.util.Properties;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.LineSeparator;
import modelo.Reparacion;
import modelo.ReparacionDAO;

public class EnviarCorreoConPDF {

    private final String usuarioSendGrid = "apikey"; // Usuario fijo para SendGrid
    private final String apiKey = "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"; // Tu API Key generada en SendGrid
    private final String host = "smtp.sendgrid.net";
    private final int port = 587;

    private File generarPDF(Reparacion reparacion) throws DocumentException, IOException {
    // Crear el documento PDF
    Document document = new Document();
    File pdfFile = new File("reparacion_" + reparacion.getIdReparacion() + ".pdf");
    PdfWriter.getInstance(document, new FileOutputStream(pdfFile));

    document.open();

    // Título del documento
    Font titleFont = new Font(Font.FontFamily.HELVETICA, 20, Font.BOLD, BaseColor.DARK_GRAY);
    Paragraph title = new Paragraph("Detalles de la Reparación", titleFont);
    title.setAlignment(Element.ALIGN_CENTER);
    document.add(title);

    // Espacio en blanco
    document.add(new Paragraph("\n"));

    // Agregar una línea de separación
    Chunk line = new Chunk(new LineSeparator());
    document.add(line);

    // Espacio en blanco
    document.add(new Paragraph("\n"));

    // Tabla con los detalles de la reparación
    PdfPTable table = new PdfPTable(2);
    table.setWidthPercentage(100);
    table.setSpacingBefore(10f);
    table.setSpacingAfter(10f);

    // Establecer el color de fondo para las celdas del encabezado
    PdfPCell cell = new PdfPCell(new Phrase("ID Reparación:"));
    cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
    table.addCell(cell);
    table.addCell(String.valueOf(reparacion.getIdReparacion()));

    table.addCell("Dispositivo:");
    table.addCell(reparacion.getDispositivo());

    table.addCell("Descripción:");
    table.addCell(reparacion.getDescripcion());

    table.addCell("Estado:");
    table.addCell(reparacion.getEstado());

    table.addCell("Costo Estimado:");
    table.addCell(String.valueOf(reparacion.getCostoEstimado()));

    table.addCell("Fecha de Ingreso:");
    table.addCell(reparacion.getFechaIngreso().toString());

    // Verificar si la fecha de entrega es null antes de convertirla a cadena
    String fechaEntregaStr = (reparacion.getFechaEntrega() != null) ? reparacion.getFechaEntrega().toString() : "Fecha no disponible";
    table.addCell("Fecha de Entrega:");
    table.addCell(fechaEntregaStr);

    // Agregar la tabla al documento
    document.add(table);

    // Espacio en blanco
    document.add(new Paragraph("\n"));

    // Mensaje de agradecimiento
    Font thankYouFont = new Font(Font.FontFamily.HELVETICA, 12, Font.ITALIC, BaseColor.GRAY);
    Paragraph thankYouMessage = new Paragraph("¡Gracias por confiar en nuestros servicios! Nos complace haber podido asistirle en la reparación de su dispositivo.", thankYouFont);
    thankYouMessage.setAlignment(Element.ALIGN_CENTER);
    document.add(thankYouMessage);

    // Espacio en blanco
    document.add(new Paragraph("\n"));

    // Firma o mensaje final
    Font closingFont = new Font(Font.FontFamily.HELVETICA, 12, Font.NORMAL, BaseColor.BLACK);
    Paragraph closingMessage = new Paragraph("Atentamente,\nEl equipo de Reparaciones", closingFont);
    closingMessage.setAlignment(Element.ALIGN_CENTER);
    document.add(closingMessage);

    // Espacio en blanco
    document.add(new Paragraph("\n"));

    // Línea de separación final
    document.add(line);

    document.close();

    return pdfFile;
}

    // Método para enviar el correo con el PDF adjunto usando SendGrid
    public void enviarCorreo(String destinatario, String asunto, String mensaje, Reparacion reparacion) {
        // Configuración SMTP para SendGrid
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", port);

        // Crear la sesión
        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(usuarioSendGrid, apiKey);
            }
        });

        try {
            // Crear el mensaje
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("carlospavelleonramirez@gmail.com")); // Dirección de remitente
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(destinatario));
            message.setSubject(asunto);

            // Parte del mensaje principal (texto)
            BodyPart mensajeTextoPart = new MimeBodyPart();
            mensajeTextoPart.setText(mensaje);

            // Crear el archivo PDF
            File pdfFile = generarPDF(reparacion);

            // Parte del archivo adjunto
            MimeBodyPart adjuntoPart = new MimeBodyPart();
            DataSource source = new FileDataSource(pdfFile);
            adjuntoPart.setDataHandler(new DataHandler(source));
            adjuntoPart.setFileName("reparacion_" + reparacion.getIdReparacion() + ".pdf");

            // Combinar texto y adjunto en Multipart
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(mensajeTextoPart);
            multipart.addBodyPart(adjuntoPart);

            message.setContent(multipart);

            // Enviar el mensaje
            Transport.send(message);
            System.out.println("Correo enviado exitosamente con el PDF adjunto.");
        } catch (MessagingException | IOException | DocumentException e) {
            e.printStackTrace();
            System.err.println("Error al enviar el correo: " + e.getMessage());
        }
    }

    // Método que se invoca cuando el usuario presiona el botón para enviar el correo
    public void enviarCorreoReparacion(String correoDestinatario, String idReparacion) {
        // Crear una instancia de ReparacionDAO para obtener la reparación
        ReparacionDAO reparacionDAO = new ReparacionDAO();
        Reparacion reparacion = reparacionDAO.obtenerReparacionPorId(Integer.parseInt(idReparacion));

        if (reparacion != null) {
            // Llamar al método para enviar el correo con el PDF adjunto
            String asunto = "Reparación Lista - ID: " + reparacion.getIdReparacion();
            String mensaje = "Estimado cliente,\n\nSu reparación está lista. Adjuntamos los detalles en el archivo PDF.\n\nSaludos.";
            enviarCorreo(correoDestinatario, asunto, mensaje, reparacion);
        } else {
            System.err.println("Reparación no encontrada.");
        }
    }
}
