import java.io.*;
import java.nio.charset.Charset;

class AhojSveteCZ {
    public static void main(String[] args) 
  {
    /* kodovani nastavime na UTF-8 */
    OutputStreamWriter osw = new OutputStreamWriter(System.out, Charset.forName("UTF-8").newEncoder() );
    System.out.println("Nastavene kodovani konzole:  " + osw.getEncoding());    
    PrintWriter p = new PrintWriter(osw);

    /* a muzeme psat na konzoli cesky */
    p.print("Příšerně žluťoučký kůň úpěl ďábelské ódy.\n");
    p.print("áčďéěíňóřšťúůýž\n");
    p.print("PŘÍŠERNĚ ŽLUŤOUČKÝ KŮŇ ÚPĚL ĎÁBELSKÉ ÓDY.\n");
    p.printf("ÁČĎÉĚÍŇÓŘŠŤÚŮÝŽ\n");
    p.flush();
  }

}



