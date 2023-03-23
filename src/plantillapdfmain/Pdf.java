package plantillapdfmain;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

/**
 *
 * @author Navi
 */
public class Plantilla {
    
    String nombre;
    String apellido;
    String fecha;
    String rutaImagen;
    
    Document documento;
    Paragraph titulo;
    
    public Plantilla(String nombre, String apellido, String fecha, String rutaImagen){
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha = fecha;
        this.rutaImagen = rutaImagen;
        
        documento = new Document();
        titulo  = new Paragraph("Plantilla Personalizada");        
    }


}