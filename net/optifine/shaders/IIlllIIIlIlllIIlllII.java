package net.optifine.shaders;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import java.nio.*;
import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.optifine.lIIIIlIIIIIlllIllIII.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;

public class IIlllIIIlIlllIIlllII
{
    private static final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll;
    
    static {
        llllIIIIlIIIlIlllIll = new lIllllIllIllIIllllll("textures/entity/end_portal.png");
    }
    
    public static void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final double n, final double n2, final double n3) {
        ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(n, n2, n3);
    }
    
    public static void llllIIIIlIIIlIlllIll(final lllllIIIIIlIlIIIIIIl lllllIIIIIlIlIIIIIIl, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final double n, final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final int n2, final boolean b) {
        lllllIIIIIlIlIIIIIIl.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, n, ilIIIlIlIIIllIlIlIIl, n2, b);
    }
    
    public static void llllIIIIlIIIlIlllIll() {
        if (llIIlllIIlllIIllIllI.IlIlIIIllIIllIlllllI) {
            llIIlllIIlllIIllIllI.IllIlIllIllIlllIIlll = true;
            llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI.bn);
        }
    }
    
    public static void IlIlIlIlIlllllllllIl() {
        if (llIIlllIIlllIIllIllI.IlIlIIIllIIllIlllllI) {
            llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI.bn);
        }
    }
    
    public static void llIllIIIIIllIlIIIIlI() {
        if (llIIlllIIlllIIllIllI.IlIlIIIllIIllIlllllI) {
            llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI.bn);
        }
    }
    
    public static void IlIIIlIlIIIllIlIlIIl() {
        if (llIIlllIIlllIIllIllI.IlIlIIIllIIllIlllllI) {
            llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI.bj);
        }
    }
    
    public static void IlIlIIIllIllIIIIIllI() {
        if (llIIlllIIlllIIllIllI.IlIlIIIllIIllIlllllI) {
            if (llIIlllIIlllIIllIllI.aU >= 2) {
                lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(33995);
                llIIlllIIlllIIllIllI.llllIIIlIlllIlIIIIIl("pre copy depth");
                GL11.glCopyTexSubImage2D(3553, 0, 0, 0, 0, 0, llIIlllIIlllIIllIllI.llIllIlIIIIllIlIIllI, llIIlllIIlllIIllIllI.lIlIlIIIllIIllIIIllI);
                llIIlllIIlllIIllIllI.llllIIIlIlllIlIIIIIl("copy depth");
                lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(33984);
            }
            llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI.bE);
        }
    }
    
    public static void IllIIlllIIIIlllIIlIl() {
        if (llIIlllIIlllIIllIllI.IlIlIIIllIIllIlllllI) {
            llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI.bj);
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI, final float n, final int n2) {
        if (!llIIlllIIlllIIllIllI.IIlllIIlIllIllIlIIll) {
            final boolean llIlllIlllllIIllIIII = llIIlllIIlllIIllIllI.llIlllIlllllIIllIIII();
            final boolean lllllIlIlIlllIlllIlI = llIIlllIIlllIIllIllI.lllllIlIlIlllIlllIlI();
            if (!llIlllIlllllIIllIIII || !lllllIlIlIlllIlllIlI) {
                llIIlllIIlllIIllIllI.IlIIllIIllIIllIIlIIl();
                llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll(false);
                GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll(llIlllIlllllIIllIIII, lllllIlIlIlllIlllIlI);
                illIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(n, n2, true, false, false);
                llIIlllIIlllIIllIllI.IIlllIIlllIIIlIlllII();
                llIIlllIIlllIIllIllI.IlIlIlIlIlllllllllIl(!llIlllIlllllIIllIIII, !lllllIlIlIlllIlllIlI);
                llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll(false, false);
            }
        }
    }
    
    public static void IlIlIlIlIlllllllllIl(final IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI, final float n, final int n2) {
        if (!llIIlllIIlllIIllIllI.IIlllIIlIllIllIlIIll && !llIIlllIIlllIIllIllI.IlIllllIIlIllIlIlIll()) {
            llIIlllIIlllIIllIllI.IlIIllIIllIIllIIlIIl();
            lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
            llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll(true);
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI.IIIIIlllIlIIIIIIIllI(), llIIlllIIlllIIllIllI.llllllIIIIIIIlllIIll());
            illIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(n, n2, true, false, true);
            llIIlllIIlllIIllIllI.IIlllIIlllIIIlIlllII();
            llIIlllIIlllIIllIllI.IlIlIlIlIlllllllllIl(true, true);
            llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll(false, false);
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll, final float n, final boolean b) {
        llIIlllIIlllIIllIllI.llIllIIIIIllIlIIIIlI(true);
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(true);
        if (b) {
            lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(519);
            GL11.glPushMatrix();
            final IntBuffer bo = llIIlllIIlllIIllIllI.bO;
            llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI.dO);
            llIIlllIIlllIIllIllI.IIllIIllIIIlIlIIIIlI = true;
            llIIIIIIlIllIIlIIIll.llllIIIIlIIIlIlllIll(n);
            llIIlllIIlllIIllIllI.IIllIIllIIIlIlIIIIlI = false;
            llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll(bo);
            GL11.glPopMatrix();
        }
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(515);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        llIIIIIIlIllIIlIIIll.llllIIIIlIIIlIlllIll(n);
        llIIlllIIlllIIllIllI.llIllIIIIIllIlIIIIlI(false);
    }
    
    public static void llIllIIIIIllIlIIIIlI(final IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI, final float n, final int n2) {
        if (!llIIlllIIlllIIllIllI.IIlllIIlIllIllIlIIll) {
            llIIlllIIlllIIllIllI.IlIIlllllIIllIIlllll();
            illIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(n, n2, false, true, false);
            llIIlllIIlllIIllIllI.lllllIIlIlIIIlIlIIIl();
        }
    }
    
    public static void llllIIIlIlllIlIIIIIl() {
        if (llIIlllIIlllIIllIllI.IlIlIIIllIIllIlllllI) {
            llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI.br);
            if (llIIlllIIlllIIllIllI.br.lIIIIlIIIIIlllIllIII() == llIIlllIIlllIIllIllI.bn.lIIIIlIIIIIlllIllIII()) {
                llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI.dP);
                lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(false);
            }
        }
    }
    
    public static void lIIIIlIIIIIlllIllIII() {
        if (llIIlllIIlllIIllIllI.IlIlIIIllIIllIlllllI) {
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(true);
            llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI.bj);
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI, final int n, final float n2, final long n3) {
        if (llIIlllIIlllIIllIllI.aW > 0 && --llIIlllIIlllIIllIllI.aK <= 0) {
            final Minecraft minecraft = Minecraft.getMinecraft();
            minecraft.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI("shadow pass");
            final lllllIIIIIlIlIIIIIIl llllIIIlIlllIlIIIIIl = minecraft.llllIIIlIlllIlIIIIIl;
            llIIlllIIlllIIllIllI.IIlllIIlIllIllIlIIll = true;
            llIIlllIIlllIIllIllI.aK = llIIlllIIlllIIllIllI.aA;
            llIIlllIIlllIIllIllI.aL = minecraft.IIIlIIIlIlIIlllIIlll.IIIllIIllIIIIIIlIIlI;
            minecraft.IIIlIIIlIlIIlllIIlll.IIIllIIllIIIIIIlIIlI = 1;
            llIIlllIIlllIIllIllI.llllIIIlIlllIlIIIIIl("pre shadow");
            GL11.glMatrixMode(5889);
            GL11.glPushMatrix();
            GL11.glMatrixMode(5888);
            GL11.glPushMatrix();
            minecraft.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI("shadow clear");
            EXTFramebufferObject.glBindFramebufferEXT(36160, llIIlllIIlllIIllIllI.ba);
            llIIlllIIlllIIllIllI.llllIIIlIlllIlIIIIIl("shadow bind sfb");
            minecraft.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI("shadow camera");
            illIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(n2, 2);
            llIIlllIIlllIIllIllI.IlIlIlIlIlllllllllIl(n2);
            llIIlllIIlllIIllIllI.llllIIIlIlllIlIIIIIl("shadow camera");
            llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI.be);
            GL20.glDrawBuffers(llIIlllIIlllIIllIllI.dN);
            llIIlllIIlllIIllIllI.llllIIIlIlllIlIIIIIl("shadow drawbuffers");
            GL11.glReadBuffer(0);
            llIIlllIIlllIIllIllI.llllIIIlIlllIlIIIIIl("shadow readbuffer");
            EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36096, 3553, llIIlllIIlllIIllIllI.dL.get(0), 0);
            if (llIIlllIIlllIIllIllI.aV != 0) {
                EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36064, 3553, llIIlllIIlllIIllIllI.dK.get(0), 0);
            }
            llIIlllIIlllIIllIllI.IllIIlllIIIIlllIIlIl("shadow fb");
            GL11.glClearColor(1.0f, 1.0f, 1.0f, 1.0f);
            GL11.glClear((llIIlllIIlllIIllIllI.aV != 0) ? 16640 : 256);
            llIIlllIIlllIIllIllI.llllIIIlIlllIlIIIIIl("shadow clear");
            minecraft.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI("shadow frustum");
            final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = net.optifine.shaders.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll();
            minecraft.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI("shadow culling");
            final net.minecraft.client.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI = new net.minecraft.client.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll);
            final llIllIIIIIllIlIIIIlI liiiIlIlIllllIIlIllI = minecraft.lIIIIlIlIllllIIlIllI();
            llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(liiiIlIlIllllIIlIllI.lIIlIIIlIllIlIllIIIl + (liiiIlIlIllllIIlIllI.IIlllIlIIllIlIlIlIIl - liiiIlIlIllllIIlIllI.lIIlIIIlIllIlIllIIIl) * n2, liiiIlIlIllllIIlIllI.IIlIIIlllIllIllIlIII + (liiiIlIlIllllIIlIllI.llIIIlIlIllIIlIlIlII - liiiIlIlIllllIIlIllI.IIlIIIlllIllIllIlIII) * n2, liiiIlIlIllllIIlIllI.lIlIlIlllIIlIlIlllIl + (liiiIlIlIllllIIlIllI.lllllIlIIIlIlIIlllII - liiiIlIlIllllIIlIllI.lIlIlIlllIIlIlIlllIl) * n2);
            lllllIlIIIlIlIIlllII.llIIlIIIlIIIllIlIIIl(7425);
            lllllIlIIIlIlIIlllII.llIIlIIIlIIIllIlIIIl();
            lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(515);
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(true);
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(true, true, true, true);
            lllllIlIIIlIlIIlllII.IlIllIlIlIIIlIlIlIII();
            minecraft.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI("shadow prepareterrain");
            minecraft.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl);
            minecraft.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI("shadow setupterrain");
            llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(liiiIlIlIllllIIlIllI, n2, llIllIIIIIllIlIIIIlI, illIIllIIIlIlIIIIlI.lIIIIlIIIIIlllIllIII++, minecraft.lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl());
            minecraft.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI("shadow updatechunks");
            minecraft.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI("shadow terrain");
            lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5888);
            lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
            lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI();
            llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll, n2, 2, liiiIlIlIllllIIlIllI);
            llIIlllIIlllIIllIllI.llllIIIlIlllIlIIIIIl("shadow terrain solid");
            lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl();
            llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl, n2, 2, liiiIlIlIllllIIlIllI);
            llIIlllIIlllIIllIllI.llllIIIlIlllIlIIIIIl("shadow terrain cutoutmipped");
            minecraft.lllIllIIIllllllIllll().IlIlIlIlIlllllllllIl(IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl).IlIlIlIlIlllllllllIl(false, false);
            llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI, n2, 2, liiiIlIlIllllIIlIllI);
            llIIlllIIlllIIllIllI.llllIIIlIlllIlIIIIIl("shadow terrain cutout");
            minecraft.lllIllIIIllllllIllll().IlIlIlIlIlllllllllIl(IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl).IlIlIIIllIllIIIIIllI();
            lllllIlIIIlIlIIlllII.llIIlIIIlIIIllIlIIIl(7424);
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(516, 0.1f);
            lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5888);
            lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
            lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
            minecraft.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI("shadow entities");
            if (lIIIIlIIIIIlllIllIII.l.llIllIIIIIllIlIIIIlI()) {
                lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(lIIIIlIIIIIlllIllIII.l, 0);
            }
            llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(liiiIlIlIllllIIlIllI, llIllIIIIIllIlIIIIlI, n2);
            llIIlllIIlllIIllIllI.llllIIIlIlllIlIIIIIl("shadow entities");
            lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5888);
            lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(true);
            lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
            lllllIlIIIlIlIIlllII.llllIIllllIlIlIIIIll();
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(770, 771, 1, 0);
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(516, 0.1f);
            if (llIIlllIIlllIIllIllI.aW >= 2) {
                lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(33989);
                llIIlllIIlllIIllIllI.llllIIIlIlllIlIIIIIl("pre copy shadow depth");
                GL11.glCopyTexSubImage2D(3553, 0, 0, 0, 0, 0, llIIlllIIlllIIllIllI.aC, llIIlllIIlllIIllIllI.aD);
                llIIlllIIlllIIllIllI.llllIIIlIlllIlIIIIIl("copy shadow depth");
                lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(33984);
            }
            lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(true);
            minecraft.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl);
            lllllIlIIIlIlIIlllII.llIIlIIIlIIIllIlIIIl(7425);
            llIIlllIIlllIIllIllI.llllIIIlIlllIlIIIIIl("shadow pre-translucent");
            GL20.glDrawBuffers(llIIlllIIlllIIllIllI.dN);
            llIIlllIIlllIIllIllI.llllIIIlIlllIlIIIIIl("shadow drawbuffers pre-translucent");
            llIIlllIIlllIIllIllI.IllIIlllIIIIlllIIlIl("shadow pre-translucent");
            if (llIIlllIIlllIIllIllI.lIlIlIIIllIIllIIIllI()) {
                minecraft.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI("shadow translucent");
                llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(IlIIlIlIIIlIIlIlIlII.IlIIIlIlIIIllIlIlIIl, n2, 2, liiiIlIlIllllIIlIllI);
                llIIlllIIlllIIllIllI.llllIIIlIlllIlIIIIIl("shadow translucent");
            }
            if (lIIIIlIIIIIlllIllIII.l.llIllIIIIIllIlIIIIlI()) {
                lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl();
                lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(lIIIIlIIIIIlllIllIII.l, 1);
                llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(liiiIlIlIllllIIlIllI, llIllIIIIIllIlIIIIlI, n2);
                lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(lIIIIlIIIIIlllIllIII.l, -1);
                lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll();
                llIIlllIIlllIIllIllI.llllIIIlIlllIlIIIIIl("shadow entities 1");
            }
            lllllIlIIIlIlIIlllII.llIIlIIIlIIIllIlIIIl(7424);
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(true);
            lllllIlIIIlIlIIlllII.llllIIllllIlIlIIIIll();
            lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
            GL11.glFlush();
            llIIlllIIlllIIllIllI.llllIIIlIlllIlIIIIIl("shadow flush");
            llIIlllIIlllIIllIllI.IIlllIIlIllIllIlIIll = false;
            minecraft.IIIlIIIlIlIIlllIIlll.IIIllIIllIIIIIIlIIlI = llIIlllIIlllIIllIllI.aL;
            minecraft.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI("shadow postprocess");
            if (llIIlllIIlllIIllIllI.lIIIlllIIIllIIIllIII) {
                if (llIIlllIIlllIIllIllI.aW >= 1) {
                    if (llIIlllIIlllIIllIllI.bT[0]) {
                        lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(33988);
                        lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(llIIlllIIlllIIllIllI.dL.get(0));
                        GL30.glGenerateMipmap(3553);
                        GL11.glTexParameteri(3553, 10241, llIIlllIIlllIIllIllI.bU[0] ? 9984 : 9987);
                    }
                    if (llIIlllIIlllIIllIllI.aW >= 2 && llIIlllIIlllIIllIllI.bT[1]) {
                        lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(33989);
                        lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(llIIlllIIlllIIllIllI.dL.get(1));
                        GL30.glGenerateMipmap(3553);
                        GL11.glTexParameteri(3553, 10241, llIIlllIIlllIIllIllI.bU[1] ? 9984 : 9987);
                    }
                    lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(33984);
                }
                if (llIIlllIIlllIIllIllI.aV >= 1) {
                    if (llIIlllIIlllIIllIllI.bV[0]) {
                        lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(33997);
                        lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(llIIlllIIlllIIllIllI.dK.get(0));
                        GL30.glGenerateMipmap(3553);
                        GL11.glTexParameteri(3553, 10241, llIIlllIIlllIIllIllI.bW[0] ? 9984 : 9987);
                    }
                    if (llIIlllIIlllIIllIllI.aV >= 2 && llIIlllIIlllIIllIllI.bV[1]) {
                        lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(33998);
                        lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(llIIlllIIlllIIllIllI.dK.get(1));
                        GL30.glGenerateMipmap(3553);
                        GL11.glTexParameteri(3553, 10241, llIIlllIIlllIIllIllI.bW[1] ? 9984 : 9987);
                    }
                    lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(33984);
                }
            }
            llIIlllIIlllIIllIllI.llllIIIlIlllIlIIIIIl("shadow postprocess");
            EXTFramebufferObject.glBindFramebufferEXT(36160, llIIlllIIlllIIllIllI.aZ);
            GL11.glViewport(0, 0, llIIlllIIlllIIllIllI.llIllIlIIIIllIlIIllI, llIIlllIIlllIIllIllI.lIlIlIIIllIIllIIIllI);
            llIIlllIIlllIIllIllI.bO = null;
            minecraft.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl);
            llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI.bn);
            GL11.glMatrixMode(5888);
            GL11.glPopMatrix();
            GL11.glMatrixMode(5889);
            GL11.glPopMatrix();
            GL11.glMatrixMode(5888);
            llIIlllIIlllIIllIllI.llllIIIlIlllIlIIIIIl("shadow end");
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final IlIIlIlIIIlIIlIlIlII ilIIlIlIIIlIIlIlIlII) {
        if (llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll(ilIIlIlIIIlIIlIlIlII)) {
            lllllIlIIIlIlIIlllII.IlIllIlIlIIIlIlIlIII();
        }
        if (lIIIIlIlIllllIIlIllI.IllIIlllIIIIlllIIlIl()) {
            GL11.glEnableClientState(32885);
            GL20.glEnableVertexAttribArray(llIIlllIIlllIIllIllI.llIllIIlllllllllllll);
            GL20.glEnableVertexAttribArray(llIIlllIIlllIIllIllI.lllllIIllIlIllIllllI);
            GL20.glEnableVertexAttribArray(llIIlllIIlllIIllIllI.IIllIIIlIIlIlIlIIIII);
        }
    }
    
    public static void IlIlIlIlIlllllllllIl(final IlIIlIlIIIlIIlIlIlII ilIIlIlIIIlIIlIlIlII) {
        if (lIIIIlIlIllllIIlIllI.IllIIlllIIIIlllIIlIl()) {
            GL11.glDisableClientState(32885);
            GL20.glDisableVertexAttribArray(llIIlllIIlllIIllIllI.llIllIIlllllllllllll);
            GL20.glDisableVertexAttribArray(llIIlllIIlllIIllIllI.lllllIIllIlIllIllllI);
            GL20.glDisableVertexAttribArray(llIIlllIIlllIIllIllI.IIllIIIlIIlIlIlIIIII);
        }
        if (llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll(ilIIlIlIIIlIIlIlIlII)) {
            lllllIlIIIlIlIIlllII.llllIIllllIlIlIIIIll();
        }
    }
    
    public static void lIIIlllIIIllIIIllIII() {
        GL11.glVertexPointer(3, 5126, 56, 0L);
        GL11.glColorPointer(4, 5121, 56, 12L);
        GL11.glTexCoordPointer(2, 5126, 56, 16L);
        lIIIIlIlIllllIIlIllI.lIlIlIIIllIIllIIIllI(lIIIIlIlIllllIIlIllI.lllIIIIlllllIlIIllIl);
        GL11.glTexCoordPointer(2, 5122, 56, 24L);
        lIIIIlIlIllllIIlIllI.lIlIlIIIllIIllIIIllI(lIIIIlIlIllllIIlIllI.IIlllIIlIllIllIlIIll);
        GL11.glNormalPointer(5120, 56, 28L);
        GL20.glVertexAttribPointer(llIIlllIIlllIIllIllI.llIllIIlllllllllllll, 2, 5126, false, 56, 32L);
        GL20.glVertexAttribPointer(llIIlllIIlllIIllIllI.lllllIIllIlIllIllllI, 4, 5122, false, 56, 40L);
        GL20.glVertexAttribPointer(llIIlllIIlllIIllIllI.IIllIIIlIIlIlIlIIIII, 3, 5122, false, 56, 48L);
    }
    
    public static void llIIlIIIlIIIllIlIIIl() {
        llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI.bt);
    }
    
    public static void llIllIlIIIIllIlIIllI() {
    }
    
    public static void lIlIlIIIllIIllIIIllI() {
    }
    
    public static void IlIlIIIllIIllIlllllI() {
    }
    
    public static void IIIIlllIIIIIIlIIIlll() {
        lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
    }
    
    public static void llllIIllllIlIlIIIIll() {
        llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI.bx);
    }
    
    public static void IlIllIlIlIIIlIlIlIII() {
        if (llIIlllIIlllIIllIllI.IlIlIIIllIIllIlllllI) {
            if (llIIlllIIlllIIllIllI.lIllllIllIllIIllllll() && llIIlllIIlllIIllIllI.llIlIIIIllIlIIlIlIII()) {
                llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI.bz);
            }
            else {
                llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI.bv);
            }
        }
        else {
            llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI.bd);
        }
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final IIIlIIIlIlIIlllIIlll iiIlIIIlIlIIlllIIlll, final double n, final double n2, final double n3, final float n4, final int n5, final float n6) {
        if (!llIIlllIIlllIIllIllI.IIlllIIlIllIllIlIIll && llIIlllIIlllIIllIllI.bM.lIIIIlIIIIIlllIllIII() == 0) {
            return false;
        }
        lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl();
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIIIlIlllIllIIlIllI().llllIIIIlIIIlIlllIll(IIlllIIIlIlllIIlllII.llllIIIIlIIIlIlllIll);
        final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
        final lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll);
        final float n7 = 0.5f;
        final float n8 = n7 * 0.15f;
        final float n9 = n7 * 0.3f;
        final float n10 = n7 * 0.4f;
        final float n11 = 0.0f;
        final float n12 = 0.2f;
        final float n13 = System.currentTimeMillis() % 100000L / 100000.0f;
        final int n14 = 240;
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n, n2 + n6, n3 + 1.0).llllIIIIlIIIlIlllIll(n8, n9, n10, 1.0f).llllIIIIlIIIlIlllIll(n11 + n13, n11 + n13).llllIIIIlIIIlIlllIll(n14, n14).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + 1.0, n2 + n6, n3 + 1.0).llllIIIIlIIIlIlllIll(n8, n9, n10, 1.0f).llllIIIIlIIIlIlllIll(n11 + n13, n12 + n13).llllIIIIlIIIlIlllIll(n14, n14).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + 1.0, n2 + n6, n3).llllIIIIlIIIlIlllIll(n8, n9, n10, 1.0f).llllIIIIlIIIlIlllIll(n12 + n13, n12 + n13).llllIIIIlIIIlIlllIll(n14, n14).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n, n2 + n6, n3).llllIIIIlIIIlIlllIll(n8, n9, n10, 1.0f).llllIIIIlIIIlIlllIll(n12 + n13, n11 + n13).llllIIIIlIIIlIlllIll(n14, n14).IlIlIIIllIllIIIIIllI();
        llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
        lllllIlIIIlIlIIlllII.IlIlIIIllIllIIIIIllI();
        return true;
    }
}
