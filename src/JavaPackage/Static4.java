/**
 * @author Srilatha
 */
package JavaPackage;

/**
 * @author srilata
 *
 */
public class Static4 {
public static void main(String[] args) {
	
	Static3 s3=new Static3(1, "jhon");
	
	Static3 s4=new Static3(2, "peter");
	
	Static3 s5 =new Static3(3, "latha");
	
	Static3.collage="Jntuh";
	
	s3.getresult();
	s4.getresult();
	s5.getresult();
}
}
