package net.minecraft.IIlllIIlIllIllIlIIll;

import net.minecraft.client.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import java.util.*;
import net.minecraft.client.IlIlIlIlIlllllllllIl.*;
import com.mojang.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;

public class IIIIlllIIIIIIlIIIlll
{
    public static final int llllIIIIlIIIlIlllIll = 8;
    public static final int IlIlIlIlIlllllllllIl = 8;
    public static final int llIllIIIIIllIlIIIIlI = 8;
    public static final int IlIIIlIlIIIllIlIlIIl = 8;
    public static final int IlIlIIIllIllIIIIIllI = 40;
    public static final int IllIIlllIIIIlllIIlIl = 8;
    public static final int llllIIIlIlllIlIIIIIl = 8;
    public static final int lIIIIlIIIIIlllIllIII = 8;
    public static final int lIIIlllIIIllIIIllIII = 64;
    public static final int llIIlIIIlIIIllIlIIIl = 64;
    protected Minecraft llIllIlIIIIllIlIIllI;
    public int lIlIlIIIllIIllIIIllI;
    public int IlIlIIIllIIllIlllllI;
    private IIIllIIllIIIIIIlIIlI IIIIlllIIIIIIlIIIlll;
    
    public IIIIlllIIIIIIlIIIlll() {
        this.IIIIlllIIIIIIlIIIlll = new IIIllIIllIIIIIIlIIlI(this);
    }
    
    public IIIllIIllIIIIIIlIIlI llllIIIIlIIIlIlllIll() {
        return this.IIIIlllIIIIIIlIIIlll;
    }
    
    public void init() {
    }
    
    public void llllIIIIlIIIlIlllIll(final Minecraft minecraft, final int n, final int n2) {
    }
    
    public void llllIIIIlIIIlIlllIll(final String s, final int n, final int n2, final int n3) {
        this.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(s, n, n2, n3);
    }
    
    public void IlIlIlIlIlllllllllIl(final String s, final int n, final int n2, final int n3) {
        this.llllIIIIlIIIlIlllIll(s, n, n2, n3, true);
    }
    
    public void llllIIIIlIIIlIlllIll(final String s, final int n, final int n2, final int n3, final boolean b) {
        this.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(s, n, n2, n3, false);
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        this.IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl(n, n2, n3, n4, n5, n6);
    }
    
    public static void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3, final float n4, final int n5, final int n6, final int n7, final int n8, final float n9, final float n10) {
        net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(n, n2, n3, n4, n5, n6, n7, n8, n9, n10);
    }
    
    public static void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3, final float n4, final int n5, final int n6, final float n7, final float n8) {
        net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(n, n2, n3, n4, n5, n6, n7, n8);
    }
    
    public void IlIlIlIlIlllllllllIl(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        this.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(n, n2, n3, n4, n5, n6);
    }
    
    public void IlIlIlIlIlllllllllIl() {
        this.IIIIlllIIIIIIlIIIlll.IlIlIIIllIIllIlllllI();
    }
    
    public boolean llIllIIIIIllIlIIIIlI() {
        return this.IIIIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl();
    }
    
    public void llllIIIIlIIIlIlllIll(final int n) {
        this.IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl(n);
    }
    
    public void render(final int n, final int n2, final float n3) {
        for (int i = 0; i < this.IIIIlllIIIIIIlIIIlll.lIIIlllIIIllIIIllIII().size(); ++i) {
            ((IllIIlllIIIIlllIIlIl)this.IIIIlllIIIIIIlIIIlll.lIIIlllIIIllIIIllIII().get(i)).llllIIIIlIIIlIlllIll(n, n2);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final int n, final int n2) {
        this.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl, n, n2);
    }
    
    public void llllIIIIlIIIlIlllIll(final String s, final int n, final int n2) {
        this.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(s, n, n2);
    }
    
    public void llllIIIIlIIIlIlllIll(final List list, final int n, final int n2) {
        this.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(list, n, n2);
    }
    
    public static void llllIIIIlIIIlIlllIll(final String s, final String s2) {
        lIllllIllIllIIllllll lIllllIllIllIIllllll = net.minecraft.client.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s2);
        if (lIllllIllIllIIllllll == null) {
            lIllllIllIllIIllllll = net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(UUIDTypeAdapter.fromString(s));
        }
        net.minecraft.client.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll, s2);
        Minecraft.getMinecraft().lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll);
    }
    
    public static void llllIIIIlIIIlIlllIll(final String s) {
        Minecraft.getMinecraft().lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll(s));
    }
    
    public void tick() {
    }
    
    public int IlIIIlIlIIIllIlIlIIl() {
        return this.IIIIlllIIIIIIlIIIlll.llllIIllllIlIlIIIIll;
    }
    
    public int IlIlIIIllIllIIIIIllI() {
        return this.IIIIlllIIIIIIlIIIlll.IlIllIlIlIIIlIlIlIII;
    }
    
    public int IllIIlllIIIIlllIIlIl() {
        return this.IIIIlllIIIIIIlIIIlll.llllIIIlIlllIlIIIIIl();
    }
    
    public int IlIlIlIlIlllllllllIl(final String s) {
        return this.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(s);
    }
    
    public void llIllIIIIIllIlIIIIlI(final String s, final int n, final int n2, final int n3) {
        this.IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl(s, n, n2, n3);
    }
    
    public List llllIIIIlIIIlIlllIll(final String s, final int n) {
        return this.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(s, n);
    }
    
    public void buttonClicked(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
    }
    
    public static IllIIlllIIIIlllIIlIl llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final String s) {
        return new IllIIlllIIIIlllIIlIl(n, n2, n3, s);
    }
    
    public static IllIIlllIIIIlllIIlIl llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4, final int n5, final String s) {
        return new IllIIlllIIIIlllIIlIl(n, n2, n3, n4, n5, s);
    }
    
    public void llllIIIlIlllIlIIIIIl() {
        this.IIIIlllIIIIIIlIIIlll.lIIIIlIIIIIlllIllIII();
    }
    
    public void llllIIIIlIIIlIlllIll(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
        this.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl);
    }
    
    public List lIIIIlIIIIIlllIllIII() {
        return this.IIIIlllIIIIIIlIIIlll.lIIIlllIIIllIIIllIII();
    }
    
    public void IlIlIlIlIlllllllllIl(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
        this.IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl(illIIlllIIIIlllIIlIl);
    }
    
    public llIllIlIIIIllIlIIllI llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4, final int n5) {
        return new llIllIlIIIIllIlIIllI(n, n2, n3, n4, n5);
    }
    
    public void mouseClicked(final int n, final int n2, final int n3) {
    }
    
    public void mouseEvent() {
    }
    
    public void lIIIlllIIIllIIIllIII() {
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final long n4) {
    }
    
    public void keyPressed(final char c, final int n) {
    }
    
    public void confirmResult(final boolean b, final int n) {
    }
    
    public static String llIllIIIIIllIlIIIIlI(final String s) {
        return net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(s, new Object[0]);
    }
    
    public static String llllIIIIlIIIlIlllIll(final String s, final Object... array) {
        return net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(s, array);
    }
    
    public net.minecraft.IIlllIIlIllIllIlIIll.llIllIIIIIllIlIIIIlI llIIlIIIlIIIllIlIIIl() {
        return new net.minecraft.IIlllIIlIllIllIlIIll.llIllIIIIIllIlIIIIlI(Minecraft.getMinecraft().IllIIlllIIIIlllIIlIl());
    }
    
    public void removed() {
    }
}
