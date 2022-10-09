package net.minecraft.client.lIlIlIIIllIIllIIIllI;

import org.lwjgl.util.vector.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import com.google.common.collect.*;
import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import java.util.*;

public class IlIlIlIlIlllllllllIl
{
    private final lIIIIlIIIIIlllIllIII llIllIIIIIllIlIIIIlI;
    public final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll;
    public final llllIIIIlIIIlIlllIll IlIlIlIlIlllllllllIl;
    private final List IlIIIlIlIIIllIlIlIIl;
    private final List IlIlIIIllIllIIIIIllI;
    private final List IllIIlllIIIIlllIIlIl;
    private final List llllIIIlIlllIlIIIIIl;
    private Matrix4f lIIIIlIIIIIlllIllIII;
    
    public IlIlIlIlIlllllllllIl(final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final String s, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final llllIIIIlIIIlIlllIll ilIlIlIlIlllllllllIl) {
        this.IlIIIlIlIIIllIlIlIIl = Lists.newArrayList();
        this.IlIlIIIllIllIIIIIllI = Lists.newArrayList();
        this.IllIIlllIIIIlllIIlIl = Lists.newArrayList();
        this.llllIIIlIlllIlIIIIIl = Lists.newArrayList();
        this.llIllIIIIIllIlIIIIlI = new lIIIIlIIIIIlllIllIII(ilIlIIIllIIllIlllllI, s);
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public void llllIIIIlIIIlIlllIll() {
        this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll();
    }
    
    public void llllIIIIlIIIlIlllIll(final String s, final Object o, final int n, final int n2) {
        this.IlIlIIIllIllIIIIIllI.add(this.IlIlIIIllIllIIIIIllI.size(), s);
        this.IlIIIlIlIIIllIlIlIIl.add(this.IlIIIlIlIIIllIlIlIIl.size(), o);
        this.IllIIlllIIIIlllIIlIl.add(this.IllIIlllIIIIlllIIlIl.size(), n);
        this.llllIIIlIlllIlIIIIIl.add(this.llllIIIlIlllIlIIIIIl.size(), n2);
    }
    
    private void llIllIIIIIllIlIIIIlI() {
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
        lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
        lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII();
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI();
        lllllIlIIIlIlIIlllII.IIIIlllIIIIIIlIIIlll();
        lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl();
        lllllIlIIIlIlIIlllII.lIIIIlIIIIIlllIllIII();
        lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll();
        lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(0);
    }
    
    public void llllIIIIlIIIlIlllIll(final Matrix4f liiiIlIIIIIlllIllIII) {
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
    }
    
    public void llllIIIIlIIIlIlllIll(final float n) {
        this.llIllIIIIIllIlIIIIlI();
        this.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI();
        final float n2 = (float)this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;
        final float n3 = (float)this.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl;
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0, 0, (int)n2, (int)n3);
        this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll("DiffuseSampler", this.llllIIIIlIIIlIlllIll);
        for (int i = 0; i < this.IlIIIlIlIIIllIlIlIIl.size(); ++i) {
            this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll((String)this.IlIlIIIllIllIIIIIllI.get(i), this.IlIIIlIlIIIllIlIlIIl.get(i));
            this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl("AuxSize" + i).llllIIIIlIIIlIlllIll((float)(int)this.IllIIlllIIIIlllIIlIl.get(i), (float)(int)this.llllIIIlIlllIlIIIIIl.get(i));
        }
        this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl("ProjMat").llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII);
        this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl("InSize").llllIIIIlIIIlIlllIll((float)this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll, (float)this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl);
        this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl("OutSize").llllIIIIlIIIlIlllIll(n2, n3);
        this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl("Time").llllIIIIlIIIlIlllIll(n);
        final Minecraft minecraft = Minecraft.getMinecraft();
        this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl("ScreenSize").llllIIIIlIIIlIlllIll((float)minecraft.IlIIIlIlIIIllIlIlIIl, (float)minecraft.IlIlIIIllIllIIIIIllI);
        this.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI();
        this.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl();
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(false);
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(false);
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(true, true, true, true);
        final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
        final lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII);
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(0.0, n3, 500.0).IlIlIlIlIlllllllllIl(255, 255, 255, 255).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n2, n3, 500.0).IlIlIlIlIlllllllllIl(255, 255, 255, 255).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n2, 0.0, 500.0).IlIlIlIlIlllllllllIl(255, 255, 255, 255).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(0.0, 0.0, 500.0).IlIlIlIlIlllllllllIl(255, 255, 255, 255).IlIlIIIllIllIIIIIllI();
        llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(true);
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(true, true, true, true);
        this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl();
        this.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI();
        this.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl();
        for (final llllIIIIlIIIlIlllIll next : this.IlIIIlIlIIIllIlIlIIl) {
            if (next instanceof llllIIIIlIIIlIlllIll) {
                next.IlIIIlIlIIIllIlIlIIl();
            }
        }
    }
    
    public lIIIIlIIIIIlllIllIII IlIlIlIlIlllllllllIl() {
        return this.llIllIIIIIllIlIIIIlI;
    }
}
