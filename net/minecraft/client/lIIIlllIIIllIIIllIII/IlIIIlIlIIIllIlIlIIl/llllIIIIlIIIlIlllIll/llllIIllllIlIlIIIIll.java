package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class llllIIllllIlIlIIIIll implements IlIllIlIlIIIlIlIlIII
{
    private final IllIllIIIIlIIlIlllII llllIIIIlIIIlIlllIll;
    private IIlIIIIIllIlIIIlIIll IlIlIlIlIlllllllllIl;
    private static final lIllllIllIllIIllllll llIllIIIIIllIlIIIIlI;
    private static boolean IlIIIlIlIIIllIlIlIIl;
    
    static {
        llIllIIIIIllIlIIIIlI = new lIllllIllIllIIllllll("textures/entity/cow/mushroom_red.png");
        llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl = false;
    }
    
    public static void llllIIIIlIIIlIlllIll() {
        llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(llllIIllllIlIlIIIIll.llIllIIIIIllIlIIIIlI);
    }
    
    public llllIIllllIlIlIIIIll(final IllIllIIIIlIIlIlllII llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        (this.IlIlIlIlIlllllllllIl = new IIlIIIIIllIlIIIlIIll(this.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl)).IlIlIlIlIlllllllllIl(16, 16);
        this.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI = -6.0f;
        this.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI = -8.0f;
        this.IlIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl = llIllIIlllllllllllll.IlIlIlIlIlllllllllIl / 4.0f;
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(new int[][] { null, null, { 16, 16, 0, 0 }, { 16, 16, 0, 0 }, null, null }, 0.0f, 0.0f, 10.0f, 20.0f, 16.0f, 0.0f, 0.0f);
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(new int[][] { null, null, null, null, { 16, 16, 0, 0 }, { 16, 16, 0, 0 } }, 10.0f, 0.0f, 0.0f, 0.0f, 16.0f, 20.0f, 0.0f);
    }
    
    public void llllIIIIlIIIlIlllIll(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII, final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7) {
        if (!liiIlllIIIllIIIllIII.e_() && !liiIlllIIIllIIIllIII.IIIIIIIllllIlIIIIIII()) {
            final net.minecraft.client.lIIIlllIIIllIIIllIII.IlIllIlIlIIIlIlIlIII ilIIllIIllIIllIIlIIl = Minecraft.getMinecraft().IlIIllIIllIIllIIlIIl();
            if (llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl) {
                this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIllllIlIlIIIIll.llIllIIIIIllIlIIIIlI);
            }
            else {
                this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl);
            }
            lllllIlIIIlIlIIlllII.llllIIllllIlIlIIIIll();
            lllllIlIIIlIlIIlllII.IlIlIIIllIllIIIIIllI(1028);
            lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(1.0f, -1.0f, 1.0f);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.2f, 0.35f, 0.5f);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(42.0f, 0.0f, 1.0f, 0.0f);
            lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-0.5f, -0.5f, 0.5f);
            if (llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl) {
                this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(0.0625f);
            }
            else {
                ilIIllIIllIIllIIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlIlIlIIlIllIIIIIIl.lllIllIIIllllllIllll(), 1.0f);
            }
            lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
            lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.1f, 0.0f, -0.6f);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(42.0f, 0.0f, 1.0f, 0.0f);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-0.5f, -0.5f, 0.5f);
            if (llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl) {
                this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(0.0625f);
            }
            else {
                ilIIllIIllIIllIIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlIlIlIIlIllIIIIIIl.lllIllIIIllllllIllll(), 1.0f);
            }
            lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
            lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
            lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
            ((llIIlllIIlllIIllIllI)this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl()).llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(0.0625f);
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(1.0f, -1.0f, 1.0f);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 0.7f, -0.2f);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(12.0f, 0.0f, 1.0f, 0.0f);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-0.5f, -0.5f, 0.5f);
            if (llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl) {
                this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(0.0625f);
            }
            else {
                ilIIllIIllIIllIIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlIlIlIIlIllIIIIIIl.lllIllIIIllllllIllll(), 1.0f);
            }
            lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
            lllllIlIIIlIlIIlllII.IlIlIIIllIllIIIIIllI(1029);
            lllllIlIIIlIlIIlllII.IlIllIlIlIIIlIlIlIII();
        }
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        return true;
    }
}
