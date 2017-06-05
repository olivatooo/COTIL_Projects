import java.*;
public class Download{

        public static void main(String[] urls) {
            String urldisplay = urls[0];
            Bitmap mIcon11 = null;

            try {
                URL url = new URL("http://www.listmercados.com.br/imagens_produtos/001.jpg");
                InputStream in = new BufferedInputStream(url.openStream());
                ByteArrayOutputStream out = new ByteArrayOutputStream();
                byte[] buf = new byte[1024];
                int n = 0;
                while (-1!=(n=in.read(buf)))
                {
                    out.write(buf, 0, n);
                }
                out.close();
                in.close();
                byte[] response = out.toByteArray();
                FileOutputStream fos = new FileOutputStream("001.jpg");
                fos.write(response);
                fos.close();
            } catch (Exception e) {
               // Log.e("Error", e.getMessage());
                e.printStackTrace();
            }



     
        }

     }
