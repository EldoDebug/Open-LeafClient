package net.optifine.llllIIIlIlllIlIIIIIl;

import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.IlIlIlIlIlllllllllIl.*;

public class IlIIIlIlIIIllIlIlIIl
{
    private lIIIIlIIIIIlllIllIII[] llllIIIIlIIIlIlllIll;
    private boolean IlIlIlIlIlllllllllIl;
    
    public IlIIIlIlIIIllIlIlIIl() {
        this.llllIIIIlIIIlIlllIll = new lIIIIlIIIIIlllIllIII[0];
        this.IlIlIlIlIlllllllllIl = false;
    }
    
    public void llllIIIIlIIIlIlllIll(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final float n, final float n2) {
        if (this.IlIlIlIlIlllllllllIl) {
            for (int i = 0; i < this.llllIIIIlIIIlIlllIll.length; ++i) {
                this.llllIIIIlIIIlIlllIll[i].llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl, llllIIIIlIIIlIlllIll, n, n2);
            }
        }
    }
    
    public boolean llllIIIIlIIIlIlllIll() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public lIIIIlIIIIIlllIllIII[] IlIlIlIlIlllllllllIl() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public void llllIIIIlIIIlIlllIll(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        this.llllIIIIlIIIlIlllIll = (lIIIIlIIIIIlllIllIII[])net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, liiiIlIIIIIlllIllIII);
    }
}
