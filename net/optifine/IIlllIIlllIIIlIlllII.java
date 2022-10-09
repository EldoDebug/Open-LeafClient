package net.optifine;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.nio.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.optifine.util.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import java.util.*;

public class IIlllIIlllIIIlIlllII
{
    private String llIllIIIIIllIlIIIIlI;
    private String IlIIIlIlIIIllIlIlIIl;
    lIllllIllIllIIllllll llllIIIIlIIIlIlllIll;
    private int IlIlIIIllIllIIIIIllI;
    private int IllIIlllIIIIlllIIlIl;
    private int llllIIIlIlllIlIIIIIl;
    private int lIIIIlIIIIIlllIllIII;
    private int lIIIlllIIIllIIIllIII;
    private IlIIlllllIIllIIlllll[] llIIlIIIlIIIllIlIIIl;
    private int llIllIlIIIIllIlIIllI;
    private boolean lIlIlIIIllIIllIIIllI;
    private int IlIlIIIllIIllIlllllI;
    private ByteBuffer IIIIlllIIIIIIlIIIlll;
    byte[] IlIlIlIlIlllllllllIl;
    private ByteBuffer llllIIllllIlIlIIIIll;
    private boolean IlIllIlIlIIIlIlIlIII;
    private boolean IIlllIIlIllIllIlIIll;
    
    public IIlllIIlllIIIlIlllII(final String llIllIIIIIllIlIIIIlI, final byte[] ilIlIlIlIlllllllllIl, final String ilIIIlIlIIIllIlIlIIl, final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll, final int illIIlllIIIIlllIIlIl, final int llllIIIlIlllIlIIIIIl, final int liiiIlIIIIIlllIllIII, final int liiIlllIIIllIIIllIII, final Properties properties) {
        this.llIllIIIIIllIlIIIIlI = null;
        this.IlIIIlIlIIIllIlIlIIl = null;
        this.llllIIIIlIIIlIlllIll = null;
        this.IlIlIIIllIllIIIIIllI = -1;
        this.IllIIlllIIIIlllIIlIl = 0;
        this.llllIIIlIlllIlIIIIIl = 0;
        this.lIIIIlIIIIIlllIllIII = 0;
        this.lIIIlllIIIllIIIllIII = 0;
        this.llIIlIIIlIIIllIlIIIl = null;
        this.llIllIlIIIIllIlIIllI = 0;
        this.lIlIlIIIllIIllIIIllI = false;
        this.IlIlIIIllIIllIlllllI = 0;
        this.IIIIlllIIIIIIlIIIlll = null;
        this.IlIlIlIlIlllllllllIl = null;
        this.llllIIllllIlIlIIIIll = null;
        this.IlIllIlIlIIIlIlIlIII = true;
        this.IIlllIIlIllIllIlIIll = true;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        final int n = liiiIlIIIIIlllIllIII * liiIlllIIIllIIIllIII * 4;
        if (ilIlIlIlIlllllllllIl.length % n != 0) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid animated texture length: " + ilIlIlIlIlllllllllIl.length + ", frameWidth: " + liiiIlIIIIIlllIllIII + ", frameHeight: " + liiIlllIIIllIIIllIII);
        }
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        int n2 = ilIlIlIlIlllllllllIl.length / n;
        if (properties.get("tile.0") != null) {
            for (int n3 = 0; properties.get("tile." + n3) != null; ++n3) {
                n2 = n3 + 1;
            }
        }
        final int max = Math.max(net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(((Hashtable<K, String>)properties).get("duration"), 1), 1);
        this.llIIlIIIlIIIllIlIIIl = new IlIIlllllIIllIIlllll[n2];
        for (int i = 0; i < this.llIIlIIIlIIIllIlIIIl.length; ++i) {
            this.llIIlIIIlIIIllIlIIIl[i] = new IlIIlllllIIllIIlllll(net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll((String)properties.get("tile." + i), i), Math.max(net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll((String)properties.get("duration." + i), max), 1));
        }
        this.lIlIlIIIllIIllIIIllI = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(properties.getProperty("interpolate"), false);
        this.IlIlIIIllIIllIlllllI = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(properties.getProperty("skip"), 0);
        if (this.lIlIlIIIllIIllIIIllI) {
            this.IIIIlllIIIIIIlIIIlll = llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI(n);
        }
    }
    
    public boolean llllIIIIlIIIlIlllIll() {
        final IlIIlllllIIllIIlllll ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl();
        if (ilIlIlIlIlllllllllIl == null) {
            return false;
        }
        final IlIIlllllIIllIIlllll ilIIlllllIIllIIlllll = ilIlIlIlIlllllllllIl;
        ++ilIIlllllIIllIIlllll.llIllIIIIIllIlIIIIlI;
        if (ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI < ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl) {
            return this.lIlIlIIIllIIllIIIllI;
        }
        ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI = 0;
        ++this.llIllIlIIIIllIlIIllI;
        if (this.llIllIlIIIIllIlIIllI >= this.llIIlIIIlIIIllIlIIIl.length) {
            this.llIllIlIIIIllIlIIllI = 0;
        }
        return true;
    }
    
    public IlIIlllllIIllIIlllll IlIlIlIlIlllllllllIl() {
        return this.llllIIIIlIIIlIlllIll(this.llIllIlIIIIllIlIIllI);
    }
    
    public IlIIlllllIIllIIlllll llllIIIIlIIIlIlllIll(int n) {
        if (this.llIIlIIIlIIIllIlIIIl.length <= 0) {
            return null;
        }
        if (n < 0 || n >= this.llIIlIIIlIIIllIlIIIl.length) {
            n = 0;
        }
        return this.llIIlIIIlIIIllIlIIIl[n];
    }
    
    public int llIllIIIIIllIlIIIIlI() {
        return this.llIIlIIIlIIIllIlIIIl.length;
    }
    
    public void IlIIIlIlIIIllIlIlIIl() {
        if (this.IIlllIIlIllIllIlIIll) {
            if (this.IlIlIIIllIllIIIIIllI < 0) {
                final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = IlIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll);
                if (llllIIIIlIIIlIlllIll == null) {
                    this.IIlllIIlIllIllIlIIll = false;
                    return;
                }
                this.IlIlIIIllIllIIIIIllI = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
            }
            if (this.llllIIllllIlIlIIIIll == null) {
                (this.llllIIllllIlIlIIIIll = llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI(this.IlIlIlIlIlllllllllIl.length)).put(this.IlIlIlIlIlllllllllIl);
                this.llllIIllllIlIlIIIIll.flip();
                this.IlIlIlIlIlllllllllIl = null;
            }
            this.IlIllIlIlIIIlIlIlIII = (!llIIIllIlIllIllIIIIl.llllIIIIlIIIlIlllIll() || llIIIllIlIllIllIIIIl.IlIIIlIlIIIllIlIlIIl(this.IlIlIIIllIllIIIIIllI));
            if (this.llllIIIIlIIIlIlllIll() && this.IlIllIlIlIIIlIlIlIII) {
                final int n = this.lIIIIlIIIIIlllIllIII * this.lIIIlllIIIllIIIllIII * 4;
                final IlIIlllllIIllIIlllll ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl();
                if (ilIlIlIlIlllllllllIl != null) {
                    final int n2 = n * ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;
                    if (n2 + n <= this.llllIIllllIlIlIIIIll.limit()) {
                        if (this.lIlIlIIIllIIllIIIllI && ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI > 0) {
                            if (this.IlIlIIIllIIllIlllllI <= 1 || ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI % this.IlIlIIIllIIllIlllllI == 0) {
                                this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, this.llllIIIIlIIIlIlllIll(this.llIllIlIIIIllIlIIllI + 1), 1.0 * ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI / ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl);
                            }
                        }
                        else {
                            this.llllIIllllIlIlIIIIll.position(n2);
                            lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(this.IlIlIIIllIllIIIIIllI);
                            GL11.glTexSubImage2D(3553, 0, this.IllIIlllIIIIlllIIlIl, this.llllIIIlIlllIlIIIIIl, this.lIIIIlIIIIIlllIllIII, this.lIIIlllIIIllIIIllIII, 6408, 5121, this.llllIIllllIlIlIIIIll);
                        }
                    }
                }
            }
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final IlIIlllllIIllIIlllll ilIIlllllIIllIIlllll, final IlIIlllllIIllIIlllll ilIIlllllIIllIIlllll2, final double n) {
        final int n2 = this.lIIIIlIIIIIlllIllIII * this.lIIIlllIIIllIIIllIII * 4;
        final int n3 = n2 * ilIIlllllIIllIIlllll.llllIIIIlIIIlIlllIll;
        if (n3 + n2 <= this.llllIIllllIlIlIIIIll.limit()) {
            final int n4 = n2 * ilIIlllllIIllIIlllll2.llllIIIIlIIIlIlllIll;
            if (n4 + n2 <= this.llllIIllllIlIlIIIIll.limit()) {
                this.IIIIlllIIIIIIlIIIlll.clear();
                for (int i = 0; i < n2; ++i) {
                    this.IIIIlllIIIIIIlIIIlll.put((byte)this.llllIIIIlIIIlIlllIll(this.llllIIllllIlIlIIIIll.get(n3 + i) & 0xFF, this.llllIIllllIlIlIIIIll.get(n4 + i) & 0xFF, n));
                }
                this.IIIIlllIIIIIIlIIIlll.flip();
                lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(this.IlIlIIIllIllIIIIIllI);
                GL11.glTexSubImage2D(3553, 0, this.IllIIlllIIIIlllIIlIl, this.llllIIIlIlllIlIIIIIl, this.lIIIIlIIIIIlllIllIII, this.lIIIlllIIIllIIIllIII, 6408, 5121, this.IIIIlllIIIIIIlIIIlll);
            }
        }
    }
    
    private int llllIIIIlIIIlIlllIll(final int n, final int n2, final double n3) {
        return (int)(n * (1.0 - n3) + n2 * n3);
    }
    
    public String IlIlIIIllIllIIIIIllI() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public String IllIIlllIIIIlllIIlIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public lIllllIllIllIIllllll llllIIIlIlllIlIIIIIl() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public boolean lIIIIlIIIIIlllIllIII() {
        return this.IlIllIlIlIIIlIlIlIII;
    }
}
