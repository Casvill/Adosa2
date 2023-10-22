package model;

/**
 *
 * @author Daniel Casvill
 */
public class ModelInstructions 
{
    private String inst1;
    private String inst2;
    private String inst3;
    private String inst4;
    private byte position;

    public ModelInstructions() 
    {
        inst1 = "/images/instructions1.png";
        inst2 = "/images/instructions2.png";
        inst3 = "/images/instructions3.png";
        inst4 = "/images/instructions4.png";
        position = 1;
    }

    public byte getPosition() {
        return position;
    }

    public void setPosition(byte position) {
        this.position = position;
    }

    public String getInst1() {
        return inst1;
    }

    public String getInst2() {
        return inst2;
    }

    public String getInst3() {
        return inst3;
    }

    public String getInst4() {
        return inst4;
    }
}
