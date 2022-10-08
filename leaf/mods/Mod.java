package leaf.mods;

import java.awt.*;
import leaf.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.*;

public class Mod
{
    private String llllIIIIlIIIlIlllIll;
    private Color IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    private int IlIlIIIllIllIIIIIllI;
    private int IllIIlllIIIIlllIIlIl;
    private float llllIIIlIlllIlIIIIIl;
    private boolean lIIIIlIIIIIlllIllIII;
    private lIIIIlIIIIIlllIllIII lIIIlllIIIllIIIllIII;
    
    public Mod(final String llllIIIIlIIIlIlllIll, final int llIllIIIIIllIlIIIIlI, final int ilIIIlIlIIIllIlIlIIl, final int n, final int n2, final int n3, final int illIIlllIIIIlllIIlIl, final boolean liiiIlIIIIIlllIllIII) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = illIIlllIIIIlllIIlIl / 127.5f;
        this.lIIIlllIIIllIIIllIII = new lIIIIlIIIIIlllIllIII(llIllIIIIIllIlIIIIlI, ilIIIlIlIIIllIlIlIIl, this.IllIIlllIIIIlllIIlIl(), this.llllIIIlIlllIlIIIIIl(), llllIIIIlIIIlIlllIll);
        this.IlIlIlIlIlllllllllIl = new Color(n, n2, n3);
        this.IlIlIIIllIllIIIIIllI = this.IlIlIlIlIlllllllllIl.getRGB();
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
    }
    
    public void llllIIIIlIIIlIlllIll() {
        this.lIIIIlIIIIIlllIllIII = !this.lIIIIlIIIIIlllIllIII;
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        this.IlIlIlIlIlllllllllIl = new Color(n, n2, n3);
        this.IlIlIIIllIllIIIIIllI = this.IlIlIlIlIlllllllllIl.getRGB();
    }
    
    public String IlIlIlIlIlllllllllIl() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public lIIIIlIIIIIlllIllIII llIllIIIIIllIlIIIIlI() {
        return this.lIIIlllIIIllIIIllIII;
    }
    
    public int IlIIIlIlIIIllIlIlIIl() {
        return this.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll();
    }
    
    public int IlIlIIIllIllIIIIIllI() {
        return this.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl();
    }
    
    public int IllIIlllIIIIlllIIlIl() {
        return 0;
    }
    
    public int llllIIIlIlllIlIIIIIl() {
        return 0;
    }
    
    public int lIIIIlIIIIIlllIllIII() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public Color lIIIlllIIIllIIIllIII() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final int illIIlllIIIIlllIIlIl) {
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = this.IllIIlllIIIIlllIIlIl / 127.5f;
    }
    
    public int llIIlIIIlIIIllIlIIIl() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public float llIllIlIIIIllIlIIllI() {
        return this.llllIIIlIlllIlIIIIIl;
    }
    
    public boolean lIlIlIIIllIIllIIIllI() {
        return this.lIIIIlIIIIIlllIllIII;
    }
    
    public void IlIlIIIllIIllIlllllI() {
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final int n2) {
    }
}
