package net.minecraft.client.IIIIlllIIIIIIlIIIlll;

import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import org.lwjgl.opengl.*;
import com.google.gson.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class llllIIIIlIIIlIlllIll
{
    private static llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll;
    private final int IlIlIlIlIlllllllllIl;
    private final int llIllIIIIIllIlIIIIlI;
    private final int IlIIIlIlIIIllIlIlIIl;
    private final int IlIlIIIllIllIIIIIllI;
    private final int IllIIlllIIIIlllIIlIl;
    private final boolean llllIIIlIlllIlIIIIIl;
    private final boolean lIIIIlIIIIIlllIllIII;
    
    static {
        net.minecraft.client.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll = null;
    }
    
    private llllIIIIlIIIlIlllIll(final boolean llllIIIlIlllIlIIIIIl, final boolean liiiIlIIIIIlllIllIII, final int ilIlIlIlIlllllllllIl, final int ilIIIlIlIIIllIlIlIIl, final int llIllIIIIIllIlIIIIlI, final int ilIlIIIllIllIIIIIllI, final int illIIlllIIIIlllIIlIl) {
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
    
    public llllIIIIlIIIlIlllIll() {
        this(false, true, 1, 0, 1, 0, 32774);
    }
    
    public llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        this(false, false, n, n2, n, n2, n3);
    }
    
    public llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4, final int n5) {
        this(true, false, n, n2, n3, n4, n5);
    }
    
    public void llllIIIIlIIIlIlllIll() {
        if (!this.equals(net.minecraft.client.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll)) {
            if (net.minecraft.client.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll == null || this.lIIIIlIIIIIlllIllIII != net.minecraft.client.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl()) {
                net.minecraft.client.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll = this;
                if (this.lIIIIlIIIIIlllIllIII) {
                    lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
                    return;
                }
                lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
            }
            GL14.glBlendEquation(this.IllIIlllIIIIlllIIlIl);
            if (this.llllIIIlIlllIlIIIIIl) {
                lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, this.IlIIIlIlIIIllIlIlIIl, this.llIllIIIIIllIlIIIIlI, this.IlIlIIIllIllIIIIIllI);
            }
            else {
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(this.IlIlIlIlIlllllllllIl, this.IlIIIlIlIIIllIlIlIIl);
            }
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof llllIIIIlIIIlIlllIll)) {
            return false;
        }
        final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = (llllIIIIlIIIlIlllIll)o;
        return this.IllIIlllIIIIlllIIlIl == llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl && this.IlIlIIIllIllIIIIIllI == llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI && this.IlIIIlIlIIIllIlIlIIl == llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl && this.lIIIIlIIIIIlllIllIII == llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII && this.llllIIIlIlllIlIIIIIl == llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl && this.llIllIIIIIllIlIIIIlI == llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI && this.IlIlIlIlIlllllllllIl == llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl;
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 * (31 * (31 * (31 * (31 * this.IlIlIlIlIlllllllllIl + this.llIllIIIIIllIlIIIIlI) + this.IlIIIlIlIIIllIlIlIIl) + this.IlIlIIIllIllIIIIIllI) + this.IllIIlllIIIIlllIIlIl) + (this.llllIIIlIlllIlIIIIIl ? 1 : 0)) + (this.lIIIIlIIIIIlllIllIII ? 1 : 0);
    }
    
    public boolean IlIlIlIlIlllllllllIl() {
        return this.lIIIIlIIIIIlllIllIII;
    }
    
    public static llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final JsonObject jsonObject) {
        if (jsonObject == null) {
            return new llllIIIIlIIIlIlllIll();
        }
        int llllIIIIlIIIlIlllIll = 32774;
        int ilIlIlIlIlllllllllIl = 1;
        int ilIlIlIlIlllllllllIl2 = 0;
        int ilIlIlIlIlllllllllIl3 = 1;
        int ilIlIlIlIlllllllllIl4 = 0;
        boolean b = true;
        boolean b2 = false;
        if (IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(jsonObject, "func")) {
            llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(jsonObject.get("func").getAsString());
            if (llllIIIIlIIIlIlllIll != 32774) {
                b = false;
            }
        }
        if (IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(jsonObject, "srcrgb")) {
            ilIlIlIlIlllllllllIl = IlIlIlIlIlllllllllIl(jsonObject.get("srcrgb").getAsString());
            if (ilIlIlIlIlllllllllIl != 1) {
                b = false;
            }
        }
        if (IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(jsonObject, "dstrgb")) {
            ilIlIlIlIlllllllllIl2 = IlIlIlIlIlllllllllIl(jsonObject.get("dstrgb").getAsString());
            if (ilIlIlIlIlllllllllIl2 != 0) {
                b = false;
            }
        }
        if (IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(jsonObject, "srcalpha")) {
            ilIlIlIlIlllllllllIl3 = IlIlIlIlIlllllllllIl(jsonObject.get("srcalpha").getAsString());
            if (ilIlIlIlIlllllllllIl3 != 1) {
                b = false;
            }
            b2 = true;
        }
        if (IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(jsonObject, "dstalpha")) {
            ilIlIlIlIlllllllllIl4 = IlIlIlIlIlllllllllIl(jsonObject.get("dstalpha").getAsString());
            if (ilIlIlIlIlllllllllIl4 != 0) {
                b = false;
            }
            b2 = true;
        }
        return b ? new llllIIIIlIIIlIlllIll() : (b2 ? new llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl2, ilIlIlIlIlllllllllIl3, ilIlIlIlIlllllllllIl4, llllIIIIlIIIlIlllIll) : new llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl2, llllIIIIlIIIlIlllIll));
    }
    
    private static int llllIIIIlIIIlIlllIll(final String s) {
        final String lowerCase = s.trim().toLowerCase();
        return lowerCase.equals("add") ? 32774 : (lowerCase.equals("subtract") ? 32778 : (lowerCase.equals("reversesubtract") ? 32779 : (lowerCase.equals("reverse_subtract") ? 32779 : (lowerCase.equals("min") ? 32775 : (lowerCase.equals("max") ? 32776 : 32774)))));
    }
    
    private static int IlIlIlIlIlllllllllIl(final String s) {
        final String replaceAll = s.trim().toLowerCase().replaceAll("_", "").replaceAll("one", "1").replaceAll("zero", "0").replaceAll("minus", "-");
        return replaceAll.equals("0") ? 0 : (replaceAll.equals("1") ? 1 : (replaceAll.equals("srccolor") ? 768 : (replaceAll.equals("1-srccolor") ? 769 : (replaceAll.equals("dstcolor") ? 774 : (replaceAll.equals("1-dstcolor") ? 775 : (replaceAll.equals("srcalpha") ? 770 : (replaceAll.equals("1-srcalpha") ? 771 : (replaceAll.equals("dstalpha") ? 772 : (replaceAll.equals("1-dstalpha") ? 773 : -1)))))))));
    }
}
