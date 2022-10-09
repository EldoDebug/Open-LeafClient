package net.optifine.lIIIlllIIIllIIIllIII;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.optifine.util.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import java.nio.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;

public class lIIIlllIIIllIIIllIII
{
    private IlIIlIlIIIlIIlIlIlII llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    private int IlIlIIIllIllIIIIIllI;
    private IIllIIllIIIlIlIIIIlI IllIIlllIIIIlllIIlIl;
    private lIIIIlIIIIIlllIllIII llllIIIlIlllIlIIIIIl;
    private IntBuffer lIIIIlIIIIIlllIllIII;
    private IntBuffer lIIIlllIIIllIIIllIII;
    private int llIIlIIIlIIIllIlIIIl;
    private final int llIllIlIIIIllIlIIllI;
    
    public lIIIlllIIIllIIIllIII(final IlIIlIlIIIlIIlIlIlII llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = null;
        this.IlIlIlIlIlllllllllIl = lIIIIlIlIllllIIlIllI.IlIlIIIllIllIIIIIllI();
        this.llIllIIIIIllIlIIIIlI = 4096;
        this.IlIIIlIlIIIllIlIlIIl = 0;
        this.IllIIlllIIIIlllIIlIl = new IIllIIllIIIlIlIIIIlI();
        this.llllIIIlIlllIlIIIIIl = null;
        this.lIIIIlIIIIIlllIllIII = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this.llIllIIIIIllIlIIIIlI);
        this.lIIIlllIIIllIIIllIII = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this.llIllIIIIIllIlIIIIlI);
        this.llIIlIIIlIIIllIlIIIl = 7;
        this.llIllIlIIIIllIlIIllI = net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl();
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.llllIIIIlIIIlIlllIll();
        lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(lIIIIlIlIllllIIlIllI.IllIllIIIIlIIlIlllII, this.IlIIIlIlIIIllIlIlIIl(this.llIllIIIIIllIlIIIIlI), lIIIIlIlIllllIIlIllI.IlIllllIIlIIlIlIlIll);
        this.IlIlIlIlIlllllllllIl();
    }
    
    public void llllIIIIlIIIlIlllIll(final ByteBuffer byteBuffer, final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        final int llllIIIIlIIIlIlllIll = liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll();
        final int ilIlIlIlIlllllllllIl = liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl();
        final int llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll((long)byteBuffer.limit());
        if (llllIIIIlIIIlIlllIll2 <= 0) {
            if (llllIIIIlIIIlIlllIll >= 0) {
                liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(-1);
                liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(0);
                this.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI(liiiIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl());
                this.IlIlIIIllIllIIIIIllI -= ilIlIlIlIlllllllllIl;
            }
        }
        else {
            if (llllIIIIlIIIlIlllIll2 > ilIlIlIlIlllllllllIl) {
                liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl);
                liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2);
                this.IlIIIlIlIIIllIlIlIIl += llllIIIIlIIIlIlllIll2;
                if (llllIIIIlIIIlIlllIll >= 0) {
                    this.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI(liiiIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl());
                }
                this.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl(liiiIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl());
            }
            liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2);
            this.IlIlIIIllIllIIIIIllI += llllIIIIlIIIlIlllIll2 - ilIlIlIlIlllllllllIl;
            this.IlIlIlIlIlllllllllIl(liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI());
            final long ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl(liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll());
            this.llllIIIIlIIIlIlllIll();
            lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(lIIIIlIlIllllIIlIllI.IllIllIIIIlIIlIlllII, ilIIIlIlIIIllIlIlIIl, byteBuffer);
            this.IlIlIlIlIlllllllllIl();
            if (this.IlIIIlIlIIIllIlIlIIl > this.IlIlIIIllIllIIIIIllI * 11 / 10) {
                this.llllIIIIlIIIlIlllIll(1);
            }
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final int n) {
        if (!this.IllIIlllIIIIlllIIlIl.IlIlIIIllIllIIIIIllI()) {
            lIIIIlIIIIIlllIllIII llllIIIlIlllIlIIIIIl = this.llllIIIlIlllIlIIIIIl;
            if (llllIIIlIlllIlIIIIIl == null || !this.IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl(llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl())) {
                llllIIIlIlllIlIIIIIl = (lIIIIlIIIIIlllIllIII)this.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll();
            }
            llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll();
            final lIIIIlIIIIIlllIllIII ilIlIIIllIllIIIIIllI = llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI();
            int llIllIIIIIllIlIIIIlI;
            if (ilIlIIIllIllIIIIIllI == null) {
                llIllIIIIIllIlIIIIlI = 0;
            }
            else {
                llIllIIIIIllIlIIIIlI = ilIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI();
            }
            int n2 = 0;
            while (llllIIIlIlllIlIIIIIl != null && n2 < n) {
                ++n2;
                if (llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll() == llIllIIIIIllIlIIIIlI) {
                    llIllIIIIIllIlIIIIlI += llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl();
                    llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl();
                }
                else if (llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl() <= llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll() - llIllIIIIIllIlIIIIlI) {
                    this.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(), llIllIIIIIllIlIIIIlI, llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl());
                    llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI);
                    llIllIIIIIllIlIIIIlI += llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl();
                    llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl();
                }
                else {
                    this.IlIlIlIlIlllllllllIl(this.IlIIIlIlIIIllIlIlIIl + llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl());
                    this.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(), this.IlIIIlIlIIIllIlIlIIl, llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl());
                    llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl);
                    this.IlIIIlIlIIIllIlIlIIl += llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl();
                    final lIIIIlIIIIIlllIllIII illIIlllIIIIlllIIlIl = llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl();
                    this.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI(llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl());
                    this.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl());
                    llllIIIlIlllIlIIIIIl = illIIlllIIIIlllIIlIl;
                }
            }
            if (llllIIIlIlllIlIIIIIl == null) {
                this.IlIIIlIlIIIllIlIlIIl = ((lIIIIlIIIIIlllIllIII)this.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll()).llIllIIIIIllIlIIIIlI();
            }
            this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        }
    }
    
    private void IlIlIIIllIllIIIIIllI() {
        int n = 0;
        int n2 = 0;
        for (lIIIIlIIIIIlllIllIII illIIlllIIIIlllIIlIl = (lIIIIlIIIIIlllIllIII)this.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(); illIIlllIIIIlllIIlIl != null; illIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl()) {
            ++n;
            n2 += illIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl();
            if (illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll() < 0 || illIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl() <= 0 || illIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI() > this.IlIIIlIlIIIllIlIlIIl) {
                throw new RuntimeException("Invalid range: " + illIIlllIIIIlllIIlIl);
            }
            final lIIIIlIIIIIlllIllIII ilIlIIIllIllIIIIIllI = illIIlllIIIIlllIIlIl.IlIlIIIllIllIIIIIllI();
            if (ilIlIIIllIllIIIIIllI != null && illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll() < ilIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI()) {
                throw new RuntimeException("Invalid range: " + illIIlllIIIIlllIIlIl);
            }
            final lIIIIlIIIIIlllIllIII illIIlllIIIIlllIIlIl2 = illIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl();
            if (illIIlllIIIIlllIIlIl2 != null && illIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI() > illIIlllIIIIlllIIlIl2.llllIIIIlIIIlIlllIll()) {
                throw new RuntimeException("Invalid range: " + illIIlllIIIIlllIIlIl);
            }
        }
        if (n != this.IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl()) {
            throw new RuntimeException("Invalid count: " + n + " <> " + this.IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl());
        }
        if (n2 != this.IlIlIIIllIllIIIIIllI) {
            throw new RuntimeException("Invalid size: " + n2 + " <> " + this.IlIlIIIllIllIIIIIllI);
        }
    }
    
    private void IlIlIlIlIlllllllllIl(final int n) {
        if (this.llIllIIIIIllIlIIIIlI < n) {
            this.llIllIIIIIllIlIIIIlI(n);
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        final long ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl(n);
        final long ilIIIlIlIIIllIlIlIIl2 = this.IlIIIlIlIIIllIlIlIIl(n2);
        final long ilIIIlIlIIIllIlIlIIl3 = this.IlIIIlIlIIIllIlIlIIl(n3);
        lIIIIlIlIllllIIlIllI.llllIIIlIlllIlIIIIIl(lIIIIlIlIllllIIlIllI.lIIlIIIlIllIlIllIIIl, this.IlIlIlIlIlllllllllIl);
        lIIIIlIlIllllIIlIllI.llllIIIlIlllIlIIIIIl(lIIIIlIlIllllIIlIllI.IIlIIIlllIllIllIlIII, this.IlIlIlIlIlllllllllIl);
        lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(lIIIIlIlIllllIIlIllI.lIIlIIIlIllIlIllIIIl, lIIIIlIlIllllIIlIllI.IIlIIIlllIllIllIlIII, ilIIIlIlIIIllIlIlIIl, ilIIIlIlIIIllIlIlIIl2, ilIIIlIlIIIllIlIlIIl3);
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl("Copy VBO range");
        lIIIIlIlIllllIIlIllI.llllIIIlIlllIlIIIIIl(lIIIIlIlIllllIIlIllI.lIIlIIIlIllIlIllIIIl, 0);
        lIIIIlIlIllllIIlIllI.llllIIIlIlllIlIIIIIl(lIIIIlIlIllllIIlIllI.IIlIIIlllIllIllIlIII, 0);
    }
    
    private void llIllIIIIIllIlIIIIlI(final int n) {
        int i;
        for (i = this.llIllIIIIIllIlIIIIlI * 6 / 4; i < n; i = i * 6 / 4) {}
        final long ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl(this.llIllIIIIIllIlIIIIlI);
        final long ilIIIlIlIIIllIlIlIIl2 = this.IlIIIlIlIIIllIlIlIIl(i);
        final int ilIlIIIllIllIIIIIllI = lIIIIlIlIllllIIlIllI.IlIlIIIllIllIIIIIllI();
        lIIIIlIlIllllIIlIllI.llllIIIlIlllIlIIIIIl(lIIIIlIlIllllIIlIllI.IllIllIIIIlIIlIlllII, ilIlIIIllIllIIIIIllI);
        lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(lIIIIlIlIllllIIlIllI.IllIllIIIIlIIlIlllII, ilIIIlIlIIIllIlIlIIl2, lIIIIlIlIllllIIlIllI.IlIllllIIlIIlIlIlIll);
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl("Expand VBO");
        lIIIIlIlIllllIIlIllI.llllIIIlIlllIlIIIIIl(lIIIIlIlIllllIIlIllI.IllIllIIIIlIIlIlllII, 0);
        lIIIIlIlIllllIIlIllI.llllIIIlIlllIlIIIIIl(lIIIIlIlIllllIIlIllI.lIIlIIIlIllIlIllIIIl, this.IlIlIlIlIlllllllllIl);
        lIIIIlIlIllllIIlIllI.llllIIIlIlllIlIIIIIl(lIIIIlIlIllllIIlIllI.IIlIIIlllIllIllIlIII, ilIlIIIllIllIIIIIllI);
        lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(lIIIIlIlIllllIIlIllI.lIIlIIIlIllIlIllIIIl, lIIIIlIlIllllIIlIllI.IIlIIIlllIllIllIlIII, 0L, 0L, ilIIIlIlIIIllIlIlIIl);
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl("Copy VBO: " + ilIIIlIlIIIllIlIlIIl2);
        lIIIIlIlIllllIIlIllI.llllIIIlIlllIlIIIIIl(lIIIIlIlIllllIIlIllI.lIIlIIIlIllIlIllIIIl, 0);
        lIIIIlIlIllllIIlIllI.llllIIIlIlllIlIIIIIl(lIIIIlIlIllllIIlIllI.IIlIIIlllIllIllIlIII, 0);
        lIIIIlIlIllllIIlIllI.llllIIIlIlllIlIIIIIl(this.IlIlIlIlIlllllllllIl);
        this.lIIIIlIIIIIlllIllIII = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(i);
        this.lIIIlllIIIllIIIllIII = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(i);
        this.IlIlIlIlIlllllllllIl = ilIlIIIllIllIIIIIllI;
        this.llIllIIIIIllIlIIIIlI = i;
    }
    
    public void llllIIIIlIIIlIlllIll() {
        lIIIIlIlIllllIIlIllI.llllIIIlIlllIlIIIIIl(lIIIIlIlIllllIIlIllI.IllIllIIIIlIIlIlllII, this.IlIlIlIlIlllllllllIl);
    }
    
    public void llllIIIIlIIIlIlllIll(final int llIIlIIIlIIIllIlIIIl, final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        if (this.llIIlIIIlIIIllIlIIIl != llIIlIIIlIIIllIlIIIl) {
            if (this.lIIIIlIIIIIlllIllIII.position() > 0) {
                throw new IllegalArgumentException("Mixed region draw modes: " + this.llIIlIIIlIIIllIlIIIl + " != " + llIIlIIIlIIIllIlIIIl);
            }
            this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        }
        this.lIIIIlIIIIIlllIllIII.put(liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll());
        this.lIIIlllIIIllIIIllIII.put(liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl());
    }
    
    public void llllIIIIlIIIlIlllIll(final IIlllllIllIllIlIlIII illlllIllIllIlIlIII) {
        this.llllIIIIlIIIlIlllIll();
        illlllIllIllIlIlIII.llllIIIIlIIIlIlllIll();
        this.lIIIIlIIIIIlllIllIII.flip();
        this.lIIIlllIIIllIIIllIII.flip();
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(this.llIIlIIIlIIIllIlIIIl, this.lIIIIlIIIIIlllIllIII, this.lIIIlllIIIllIIIllIII);
        this.lIIIIlIIIIIlllIllIII.limit(this.lIIIIlIIIIIlllIllIII.capacity());
        this.lIIIlllIIIllIIIllIII.limit(this.lIIIlllIIIllIIIllIII.capacity());
        if (this.IlIIIlIlIIIllIlIlIIl > this.IlIlIIIllIllIIIIIllI * 11 / 10) {
            this.llllIIIIlIIIlIlllIll(1);
        }
    }
    
    public void IlIlIlIlIlllllllllIl() {
        lIIIIlIlIllllIIlIllI.llllIIIlIlllIlIIIIIl(lIIIIlIlIllllIIlIllI.IllIllIIIIlIIlIlllII, 0);
    }
    
    public void llIllIIIIIllIlIIIIlI() {
        if (this.IlIlIlIlIlllllllllIl >= 0) {
            lIIIIlIlIllllIIlIllI.llllIIIlIlllIlIIIIIl(this.IlIlIlIlIlllllllllIl);
            this.IlIlIlIlIlllllllllIl = -1;
        }
    }
    
    private long IlIIIlIlIIIllIlIlIIl(final int n) {
        return n * (long)this.llIllIlIIIIllIlIIllI;
    }
    
    private int llllIIIIlIIIlIlllIll(final long n) {
        return (int)(n / this.llIllIlIIIIllIlIIllI);
    }
    
    public int IlIIIlIlIIIllIlIlIIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
}
