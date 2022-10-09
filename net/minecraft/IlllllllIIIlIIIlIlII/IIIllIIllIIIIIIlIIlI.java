package net.minecraft.IlllllllIIIlIIIlIlII;

import org.lwjgl.input.*;
import org.lwjgl.opengl.*;

public class IIIllIIllIIIIIIlIIlI
{
    public int llllIIIIlIIIlIlllIll;
    public int IlIlIlIlIlllllllllIl;
    
    public void llllIIIIlIIIlIlllIll() {
        Mouse.setGrabbed(true);
        this.llllIIIIlIIIlIlllIll = 0;
        this.IlIlIlIlIlllllllllIl = 0;
    }
    
    public void IlIlIlIlIlllllllllIl() {
        Mouse.setCursorPosition(Display.getWidth() / 2, Display.getHeight() / 2);
        Mouse.setGrabbed(false);
    }
    
    public void llIllIIIIIllIlIIIIlI() {
        this.llllIIIIlIIIlIlllIll = Mouse.getDX();
        this.IlIlIlIlIlllllllllIl = Mouse.getDY();
    }
}
