package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import java.util.*;
import com.google.common.collect.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;

public class IIlIIIIIllIlIIIlIIll extends llIllIIIIIllIlIIIIlI
{
    protected int IlIlIIIllIllIIIIIllI;
    protected int IllIIlllIIIIlllIIlIl;
    public int llllIIIlIlllIlIIIIIl;
    public int lIIIIlIIIIIlllIllIII;
    private List llIllIlIIIIllIlIIllI;
    public int lIIIlllIIIllIIIllIII;
    private boolean lIlIlIIIllIIllIIIllI;
    public boolean llIIlIIIlIIIllIlIIIl;
    private boolean IlIlIIIllIIllIlllllI;
    private int IIIIlllIIIIIIlIIIlll;
    private int llllIIllllIlIlIIIIll;
    private int IlIllIlIlIIIlIlIlIII;
    private int IIlllIIlIllIllIlIIll;
    private FontRenderer lllIIIIlllllIlIIllIl;
    private int IlIlIIIIIIlllIlIllIl;
    
    public IIlIIIIIllIlIIIlIIll(final FontRenderer lllIIIIlllllIlIIllIl, final int liiIlllIIIllIIIllIII, final int llllIIIlIlllIlIIIIIl, final int liiiIlIIIIIlllIllIII, final int ilIlIIIllIllIIIIIllI, final int illIIlllIIIIlllIIlIl, final int iiiIlllIIIIIIlIIIlll) {
        this.IlIlIIIllIllIIIIIllI = 200;
        this.IllIIlllIIIIlllIIlIl = 20;
        this.llIIlIIIlIIIllIlIIIl = true;
        this.lllIIIIlllllIlIIllIl = lllIIIIlllllIlIIllIl;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llIllIlIIIIllIlIIllI = Lists.newArrayList();
        this.lIlIlIIIllIIllIIIllI = false;
        this.IlIlIIIllIIllIlllllI = false;
        this.IIIIlllIIIIIIlIIIlll = iiiIlllIIIIIIlIIIlll;
        this.llllIIllllIlIlIIIIll = -1;
        this.IlIllIlIlIIIlIlIlIII = -1;
        this.IIlllIIlIllIllIlIIll = -1;
        this.IlIlIIIIIIlllIlIllIl = 0;
    }
    
    public void llllIIIIlIIIlIlllIll(final String s) {
        this.llIllIlIIIIllIlIIllI.add(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(s, new Object[0]));
    }
    
    public IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll() {
        this.lIlIlIIIllIIllIIIllI = true;
        return this;
    }
    
    public void llllIIIIlIIIlIlllIll(final Minecraft minecraft, final int n, final int n2) {
        if (this.llIIlIIIlIIIllIlIIIl) {
            lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(770, 771, 1, 0);
            this.IlIlIlIlIlllllllllIl(minecraft, n, n2);
            final int n3 = this.lIIIIlIIIIIlllIllIII + this.IllIIlllIIIIlllIIlIl / 2 + this.IlIlIIIIIIlllIlIllIl / 2 - this.llIllIlIIIIllIlIIllI.size() * 10 / 2;
            for (int i = 0; i < this.llIllIlIIIIllIlIIllI.size(); ++i) {
                if (this.lIlIlIIIllIIllIIIllI) {
                    this.llllIIIIlIIIlIlllIll(this.lllIIIIlllllIlIIllIl, (String)this.llIllIlIIIIllIlIIllI.get(i), this.llllIIIlIlllIlIIIIIl + this.IlIlIIIllIllIIIIIllI / 2, n3 + i * 10, this.IIIIlllIIIIIIlIIIlll);
                }
                else {
                    this.IlIlIlIlIlllllllllIl(this.lllIIIIlllllIlIIllIl, (String)this.llIllIlIIIIllIlIIllI.get(i), this.llllIIIlIlllIlIIIIIl, n3 + i * 10, this.IIIIlllIIIIIIlIIIlll);
                }
            }
        }
    }
    
    protected void IlIlIlIlIlllllllllIl(final Minecraft minecraft, final int n, final int n2) {
        if (this.IlIlIIIllIIllIlllllI) {
            final int n3 = this.IlIlIIIllIllIIIIIllI + this.IlIlIIIIIIlllIlIllIl * 2;
            final int n4 = this.IllIIlllIIIIlllIIlIl + this.IlIlIIIIIIlllIlIllIl * 2;
            final int n5 = this.llllIIIlIlllIlIIIIIl - this.IlIlIIIIIIlllIlIllIl;
            final int n6 = this.lIIIIlIIIIIlllIllIII - this.IlIlIIIIIIlllIlIllIl;
            net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(n5, n6, n5 + n3, n6 + n4, this.llllIIllllIlIlIIIIll);
            this.llllIIIIlIIIlIlllIll(n5, n5 + n3, n6, this.IlIllIlIlIIIlIlIlIII);
            this.llllIIIIlIIIlIlllIll(n5, n5 + n3, n6 + n4, this.IIlllIIlIllIllIlIIll);
            this.IlIlIlIlIlllllllllIl(n5, n6, n6 + n4, this.IlIllIlIlIIIlIlIlIII);
            this.IlIlIlIlIlllllllllIl(n5 + n3, n6, n6 + n4, this.IIlllIIlIllIllIlIIll);
        }
    }
}
