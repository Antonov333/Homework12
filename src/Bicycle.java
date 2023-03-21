public class Bicycle {
    String type ;
    float wheelSize ;
    float frameSize ;

    Bicycle(String t, float w, float f) {
        this.type = t ;
        this.wheelSize = w ;
        this.frameSize = f ;
    }

    public float getWheelSize() {
        return wheelSize;
    }
    public String getType() {
        return type ;
    }
    public float getFrameSize(){
        return frameSize ;
    }
}
