import org.opencv.core.Core
import org.opencv.core.Mat
import org.opencv.core.CvType
 
object hellocv {
  def main(args:Array[String]) {
    System.loadLibrary(Core.NATIVE_LIBRARY_NAME)
	val mat = Mat.eye(3,3, CvType.CV_8UC1)
	println(mat.dump)

  }
}
