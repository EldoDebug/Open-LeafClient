package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import org.lwjgl.input.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import org.apache.commons.lang3.*;
import java.util.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.*;

public class IIIIlllIIIIIIlIIIlll extends lIIllIIIllllIlllIllI
{
    private lIIllIIIllllIlllIllI IllIIlllIIIIlllIIlIl;
    private lIIlIIIIIIIlIIlIlIIl llllIIIlIlllIlIIIIIl;
    private lIIlIIIIIIIlIIlIlIIl lIIIIlIIIIIlllIllIII;
    private String lIIIlllIIIllIIIllIII;
    private String llIIlIIIlIIIllIlIIIl;
    private String llIllIlIIIIllIlIIllI;
    private boolean lIlIlIIIllIIllIIIllI;
    private boolean IIIlIIIlIlIIlllIIlll;
    private boolean IlIlIIIlIIlIlIIlllIl;
    private boolean IlllllllIIIlIIIlIlII;
    private boolean IIlIIIIlllIlllllIlII;
    private boolean IIIlIIlIIIIlllIlllII;
    private boolean IlIlIllllllllIIIIlII;
    private IlIIIlIlIIIllIlIlIIl IIlllIlIIllIlIlIlIIl;
    private IlIIIlIlIIIllIlIlIIl llIIIlIlIllIIlIlIlII;
    private IlIIIlIlIIIllIlIlIIl lllllIlIIIlIlIIlllII;
    private IlIIIlIlIIIllIlIlIIl lIllllllIIllIlIlIlII;
    private IlIIIlIlIIIllIlIlIIl llIIlllIIlllIIllIllI;
    private IlIIIlIlIIIllIlIlIIl IIlllIIIlIlllIIlllII;
    private IlIIIlIlIIIllIlIlIIl IIlIIIIIllIlIIIlIIll;
    private String llllllIllIllIlIllllI;
    private String IIIllllllIllIIIlllIl;
    private String IlIIIlIIIllllIlIlIlI;
    private String IIIIIllIIIIlIIIIllIl;
    private int IIIIIIIIIlllIllIlIlI;
    public String IlIlIIIllIllIIIIIllI;
    private static final String[] IIllllIIIlIIIIIIllIl;
    
    static {
        IIllllIIIlIIIIIIllIl = new String[] { "CON", "COM", "PRN", "AUX", "CLOCK$", "NUL", "COM1", "COM2", "COM3", "COM4", "COM5", "COM6", "COM7", "COM8", "COM9", "LPT1", "LPT2", "LPT3", "LPT4", "LPT5", "LPT6", "LPT7", "LPT8", "LPT9" };
    }
    
    public IIIIlllIIIIIIlIIIlll(final lIIllIIIllllIlllIllI illIIlllIIIIlllIIlIl) {
        this.llIIlIIIlIIIllIlIIIl = "survival";
        this.lIlIlIIIllIIllIIIllI = true;
        this.IlIlIIIllIllIIIIIllI = "";
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.IlIIIlIIIllllIlIlIlI = "";
        this.IIIIIllIIIIlIIIIllIl = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("selectWorld.newWorld", new Object[0]);
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll();
        this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll();
    }
    
    @Override
    public void n_() {
        Keyboard.enableRepeatEvents(true);
        this.IIlllIIlIllIllIlIIll.clear();
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(0, this.llllIIllllIlIlIIIIll / 2 - 155, this.IlIllIlIlIIIlIlIlIII - 28, 150, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("selectWorld.create", new Object[0])));
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(1, this.llllIIllllIlIlIIIIll / 2 + 5, this.IlIllIlIlIIIlIlIlIII - 28, 150, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gui.cancel", new Object[0])));
        this.IIlllIIlIllIllIlIIll.add(this.IIlllIlIIllIlIlIlIIl = new IlIIIlIlIIIllIlIlIIl(2, this.llllIIllllIlIlIIIIll / 2 - 75, 115, 150, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("selectWorld.gameMode", new Object[0])));
        this.IIlllIIlIllIllIlIIll.add(this.llIIIlIlIllIIlIlIlII = new IlIIIlIlIIIllIlIlIIl(3, this.llllIIllllIlIlIIIIll / 2 - 75, 187, 150, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("selectWorld.moreWorldOptions", new Object[0])));
        this.IIlllIIlIllIllIlIIll.add(this.lllllIlIIIlIlIIlllII = new IlIIIlIlIIIllIlIlIIl(4, this.llllIIllllIlIlIIIIll / 2 - 155, 100, 150, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("selectWorld.mapFeatures", new Object[0])));
        this.lllllIlIIIlIlIIlllII.IlIlIIIllIIllIlllllI = false;
        this.IIlllIIlIllIllIlIIll.add(this.lIllllllIIllIlIlIlII = new IlIIIlIlIIIllIlIlIIl(7, this.llllIIllllIlIlIIIIll / 2 + 5, 151, 150, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("selectWorld.bonusItems", new Object[0])));
        this.lIllllllIIllIlIlIlII.IlIlIIIllIIllIlllllI = false;
        this.IIlllIIlIllIllIlIIll.add(this.llIIlllIIlllIIllIllI = new IlIIIlIlIIIllIlIlIIl(5, this.llllIIllllIlIlIIIIll / 2 + 5, 100, 150, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("selectWorld.mapType", new Object[0])));
        this.llIIlllIIlllIIllIllI.IlIlIIIllIIllIlllllI = false;
        this.IIlllIIlIllIllIlIIll.add(this.IIlllIIIlIlllIIlllII = new IlIIIlIlIIIllIlIlIIl(6, this.llllIIllllIlIlIIIIll / 2 - 155, 151, 150, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("selectWorld.allowCommands", new Object[0])));
        this.IIlllIIIlIlllIIlllII.IlIlIIIllIIllIlllllI = false;
        this.IIlllIIlIllIllIlIIll.add(this.IIlIIIIIllIlIIIlIIll = new IlIIIlIlIIIllIlIlIIl(8, this.llllIIllllIlIlIIIIll / 2 + 5, 120, 150, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("selectWorld.customizeType", new Object[0])));
        this.IIlIIIIIllIlIIIlIIll.IlIlIIIllIIllIlllllI = false;
        (this.llllIIIlIlllIlIIIIIl = new lIIlIIIIIIIlIIlIlIIl(9, this.IIllIIllIIIlIlIIIIlI, this.llllIIllllIlIlIIIIll / 2 - 100, 60, 200, 20)).IlIlIlIlIlllllllllIl(true);
        this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(this.IIIIIllIIIIlIIIIllIl);
        (this.lIIIIlIIIIIlllIllIII = new lIIlIIIIIIIlIIlIlIIl(10, this.IIllIIllIIIlIlIIIIlI, this.llllIIllllIlIlIIIIll / 2 - 100, 60, 200, 20)).llllIIIIlIIIlIlllIll(this.IlIIIlIIIllllIlIlIlI);
        this.llllIIIIlIIIlIlllIll(this.IlIlIllllllllIIIIlII);
        this.IlIlIIIllIllIIIIIllI();
        this.llllIIIlIlllIlIIIIIl();
    }
    
    private void IlIlIIIllIllIIIIIllI() {
        this.lIIIlllIIIllIIIllIII = this.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl().trim();
        char[] llllIIIIlIIIlIlllIll;
        for (int length = (llllIIIIlIIIlIlllIll = net.minecraft.IlllllllIIIlIIIlIlII.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll).length, i = 0; i < length; ++i) {
            this.lIIIlllIIIllIIIllIII = this.lIIIlllIIIllIIIllIII.replace(llllIIIIlIIIlIlllIll[i], '_');
        }
        if (StringUtils.isEmpty((CharSequence)this.lIIIlllIIIllIIIllIII)) {
            this.lIIIlllIIIllIIIllIII = "World";
        }
        this.lIIIlllIIIllIIIllIII = llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl(), this.lIIIlllIIIllIIIllIII);
    }
    
    private void llllIIIlIlllIlIIIIIl() {
        this.IIlllIlIIllIlIlIlIIl.llIIlIIIlIIIllIlIIIl = String.valueOf(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("selectWorld.gameMode", new Object[0])) + ": " + net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("selectWorld.gameMode." + this.llIIlIIIlIIIllIlIIIl, new Object[0]);
        this.llllllIllIllIlIllllI = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("selectWorld.gameMode." + this.llIIlIIIlIIIllIlIIIl + ".line1", new Object[0]);
        this.IIIllllllIllIIIlllIl = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("selectWorld.gameMode." + this.llIIlIIIlIIIllIlIIIl + ".line2", new Object[0]);
        this.lllllIlIIIlIlIIlllII.llIIlIIIlIIIllIlIIIl = String.valueOf(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("selectWorld.mapFeatures", new Object[0])) + " ";
        if (this.lIlIlIIIllIIllIIIllI) {
            this.lllllIlIIIlIlIIlllII.llIIlIIIlIIIllIlIIIl = String.valueOf(this.lllllIlIIIlIlIIlllII.llIIlIIIlIIIllIlIIIl) + net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("options.on", new Object[0]);
        }
        else {
            this.lllllIlIIIlIlIIlllII.llIIlIIIlIIIllIlIIIl = String.valueOf(this.lllllIlIIIlIlIIlllII.llIIlIIIlIIIllIlIIIl) + net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("options.off", new Object[0]);
        }
        this.lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl = String.valueOf(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("selectWorld.bonusItems", new Object[0])) + " ";
        if (this.IlllllllIIIlIIIlIlII && !this.IIlIIIIlllIlllllIlII) {
            this.lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl = String.valueOf(this.lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl) + net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("options.on", new Object[0]);
        }
        else {
            this.lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl = String.valueOf(this.lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl) + net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("options.off", new Object[0]);
        }
        this.llIIlllIIlllIIllIllI.llIIlIIIlIIIllIlIIIl = String.valueOf(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("selectWorld.mapType", new Object[0])) + " " + net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll[this.IIIIIIIIIlllIllIlIlI].IlIlIlIlIlllllllllIl(), new Object[0]);
        this.IIlllIIIlIlllIIlllII.llIIlIIIlIIIllIlIIIl = String.valueOf(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("selectWorld.allowCommands", new Object[0])) + " ";
        if (this.IIIlIIIlIlIIlllIIlll && !this.IIlIIIIlllIlllllIlII) {
            this.IIlllIIIlIlllIIlllII.llIIlIIIlIIIllIlIIIl = String.valueOf(this.IIlllIIIlIlllIIlllII.llIIlIIIlIIIllIlIIIl) + net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("options.on", new Object[0]);
        }
        else {
            this.IIlllIIIlIlllIIlllII.llIIlIIIlIIIllIlIIIl = String.valueOf(this.IIlllIIIlIlllIIlllII.llIIlIIIlIIIllIlIIIl) + net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("options.off", new Object[0]);
        }
    }
    
    public static String llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, String s) {
        s = s.replaceAll("[\\./\"]", "_");
        String[] iIllllIIIlIIIIIIllIl;
        for (int length = (iIllllIIIlIIIIIIllIl = IIIIlllIIIIIIlIIIlll.IIllllIIIlIIIIIIllIl).length, i = 0; i < length; ++i) {
            if (s.equalsIgnoreCase(iIllllIIIlIIIIIIllIl[i])) {
                s = "_" + s + "_";
            }
        }
        while (llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI(s) != null) {
            s = String.valueOf(s) + "-";
        }
        return s;
    }
    
    @Override
    public void o_() {
        Keyboard.enableRepeatEvents(false);
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (ilIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI) {
            if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 1) {
                this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl);
            }
            else if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 0) {
                this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll((lIIllIIIllllIlllIllI)null);
                if (this.IIIlIIlIIIIlllIlllII) {
                    return;
                }
                this.IIIlIIlIIIIlllIlllII = true;
                long nextLong = new Random().nextLong();
                final String ilIlIlIlIlllllllllIl = this.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl();
                if (!StringUtils.isEmpty((CharSequence)ilIlIlIlIlllllllllIl)) {
                    try {
                        final long long1 = Long.parseLong(ilIlIlIlIlllllllllIl);
                        if (long1 != 0L) {
                            nextLong = long1;
                        }
                    }
                    catch (NumberFormatException ex) {
                        nextLong = ilIlIlIlIlllllllllIl.hashCode();
                    }
                }
                final IlllIIIIlIIIlIlIlIIl illlIIIIlIIIlIlIlIIl = new IlllIIIIlIIIlIlIlIIl(nextLong, lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(this.llIIlIIIlIIIllIlIIIl), this.lIlIlIIIllIIllIIIllI, this.IIlIIIIlllIlllllIlII, llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll[this.IIIIIIIIIlllIllIlIlI]);
                illlIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI);
                if (this.IlllllllIIIlIIIlIlII && !this.IIlIIIIlllIlllllIlII) {
                    illlIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll();
                }
                if (this.IIIlIIIlIlIIlllIIlll && !this.IIlIIIIlllIlllllIlII) {
                    illlIIIIlIIIlIlIlIIl.IlIlIlIlIlllllllllIl();
                }
                this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(this.lIIIlllIIIllIIIllIII, this.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl().trim(), illlIIIIlIIIlIlIlIIl);
            }
            else if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 3) {
                this.lIIIlllIIIllIIIllIII();
            }
            else if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 2) {
                if (this.llIIlIIIlIIIllIlIIIl.equals("survival")) {
                    if (!this.IlIlIIIlIIlIlIIlllIl) {
                        this.IIIlIIIlIlIIlllIIlll = false;
                    }
                    this.IIlIIIIlllIlllllIlII = false;
                    this.llIIlIIIlIIIllIlIIIl = "hardcore";
                    this.IIlIIIIlllIlllllIlII = true;
                    this.IIlllIIIlIlllIIlllII.lIlIlIIIllIIllIIIllI = false;
                    this.lIllllllIIllIlIlIlII.lIlIlIIIllIIllIIIllI = false;
                    this.llllIIIlIlllIlIIIIIl();
                }
                else if (this.llIIlIIIlIIIllIlIIIl.equals("hardcore")) {
                    if (!this.IlIlIIIlIIlIlIIlllIl) {
                        this.IIIlIIIlIlIIlllIIlll = true;
                    }
                    this.IIlIIIIlllIlllllIlII = false;
                    this.llIIlIIIlIIIllIlIIIl = "creative";
                    this.llllIIIlIlllIlIIIIIl();
                    this.IIlIIIIlllIlllllIlII = false;
                    this.IIlllIIIlIlllIIlllII.lIlIlIIIllIIllIIIllI = true;
                    this.lIllllllIIllIlIlIlII.lIlIlIIIllIIllIIIllI = true;
                }
                else {
                    if (!this.IlIlIIIlIIlIlIIlllIl) {
                        this.IIIlIIIlIlIIlllIIlll = false;
                    }
                    this.llIIlIIIlIIIllIlIIIl = "survival";
                    this.llllIIIlIlllIlIIIIIl();
                    this.IIlllIIIlIlllIIlllII.lIlIlIIIllIIllIIIllI = true;
                    this.lIllllllIIllIlIlIlII.lIlIlIIIllIIllIIIllI = true;
                    this.IIlIIIIlllIlllllIlII = false;
                }
                this.llllIIIlIlllIlIIIIIl();
            }
            else if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 4) {
                this.lIlIlIIIllIIllIIIllI = !this.lIlIlIIIllIIllIIIllI;
                this.llllIIIlIlllIlIIIIIl();
            }
            else if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 7) {
                this.IlllllllIIIlIIIlIlII = !this.IlllllllIIIlIIIlIlII;
                this.llllIIIlIlllIlIIIIIl();
            }
            else if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 5) {
                ++this.IIIIIIIIIlllIllIlIlI;
                if (this.IIIIIIIIIlllIllIlIlI >= llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll.length) {
                    this.IIIIIIIIIlllIllIlIlI = 0;
                }
                while (!this.lIIIIlIIIIIlllIllIII()) {
                    ++this.IIIIIIIIIlllIllIlIlI;
                    if (this.IIIIIIIIIlllIllIlIlI >= llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll.length) {
                        this.IIIIIIIIIlllIllIlIlI = 0;
                    }
                }
                this.IlIlIIIllIllIIIIIllI = "";
                this.llllIIIlIlllIlIIIIIl();
                this.llllIIIIlIIIlIlllIll(this.IlIlIllllllllIIIIlII);
            }
            else if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 6) {
                this.IlIlIIIlIIlIlIIlllIl = true;
                this.IIIlIIIlIlIIlllIIlll = !this.IIIlIIIlIlIIlllIIlll;
                this.llllIIIlIlllIlIIIIIl();
            }
            else if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 8) {
                if (llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll[this.IIIIIIIIIlllIllIlIlI] == llIllIlIlIIIIIIIllII.llIllIIIIIllIlIIIIlI) {
                    this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(new net.minecraft.client.llIllIIIIIllIlIIIIlI.lIlIlIIIllIIllIIIllI(this, this.IlIlIIIllIllIIIIIllI));
                }
                else {
                    this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(new IIlllIIlIllIllIlIIll(this, this.IlIlIIIllIllIIIIIllI));
                }
            }
        }
    }
    
    private boolean lIIIIlIIIIIlllIllIII() {
        final llIllIlIlIIIIIIIllII llIllIlIlIIIIIIIllII = net.minecraft.IIIlIIlIIIIlllIlllII.llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll[this.IIIIIIIIIlllIllIlIlI];
        return llIllIlIlIIIIIIIllII != null && llIllIlIlIIIIIIIllII.IlIlIIIllIllIIIIIllI() && (llIllIlIlIIIIIIIllII != net.minecraft.IIIlIIlIIIIlllIlllII.llIllIlIlIIIIIIIllII.llllIIIlIlllIlIIIIIl || lIIllIIIllllIlllIllI.llllIIllllIlIlIIIIll());
    }
    
    private void lIIIlllIIIllIIIllIII() {
        this.llllIIIIlIIIlIlllIll(!this.IlIlIllllllllIIIIlII);
    }
    
    private void llllIIIIlIIIlIlllIll(final boolean ilIlIllllllllIIIIlII) {
        this.IlIlIllllllllIIIIlII = ilIlIllllllllIIIIlII;
        if (llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll[this.IIIIIIIIIlllIllIlIlI] == llIllIlIlIIIIIIIllII.llllIIIlIlllIlIIIIIl) {
            this.IIlllIlIIllIlIlIlIIl.IlIlIIIllIIllIlllllI = !this.IlIlIllllllllIIIIlII;
            this.IIlllIlIIllIlIlIlIIl.lIlIlIIIllIIllIIIllI = false;
            if (this.llIllIlIIIIllIlIIllI == null) {
                this.llIllIlIIIIllIlIIllI = this.llIIlIIIlIIIllIlIIIl;
            }
            this.llIIlIIIlIIIllIlIIIl = "spectator";
            this.lllllIlIIIlIlIIlllII.IlIlIIIllIIllIlllllI = false;
            this.lIllllllIIllIlIlIlII.IlIlIIIllIIllIlllllI = false;
            this.llIIlllIIlllIIllIllI.IlIlIIIllIIllIlllllI = this.IlIlIllllllllIIIIlII;
            this.IIlllIIIlIlllIIlllII.IlIlIIIllIIllIlllllI = false;
            this.IIlIIIIIllIlIIIlIIll.IlIlIIIllIIllIlllllI = false;
        }
        else {
            this.IIlllIlIIllIlIlIlIIl.IlIlIIIllIIllIlllllI = !this.IlIlIllllllllIIIIlII;
            this.IIlllIlIIllIlIlIlIIl.lIlIlIIIllIIllIIIllI = true;
            if (this.llIllIlIIIIllIlIIllI != null) {
                this.llIIlIIIlIIIllIlIIIl = this.llIllIlIIIIllIlIIllI;
                this.llIllIlIIIIllIlIIllI = null;
            }
            this.lllllIlIIIlIlIIlllII.IlIlIIIllIIllIlllllI = (this.IlIlIllllllllIIIIlII && llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll[this.IIIIIIIIIlllIllIlIlI] != llIllIlIlIIIIIIIllII.IllIIlllIIIIlllIIlIl);
            this.lIllllllIIllIlIlIlII.IlIlIIIllIIllIlllllI = this.IlIlIllllllllIIIIlII;
            this.llIIlllIIlllIIllIllI.IlIlIIIllIIllIlllllI = this.IlIlIllllllllIIIIlII;
            this.IIlllIIIlIlllIIlllII.IlIlIIIllIIllIlllllI = this.IlIlIllllllllIIIIlII;
            this.IIlIIIIIllIlIIIlIIll.IlIlIIIllIIllIlllllI = (this.IlIlIllllllllIIIIlII && (llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll[this.IIIIIIIIIlllIllIlIlI] == llIllIlIlIIIIIIIllII.llIllIIIIIllIlIIIIlI || llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll[this.IIIIIIIIIlllIllIlIlI] == llIllIlIlIIIIIIIllII.IllIIlllIIIIlllIIlIl));
        }
        this.llllIIIlIlllIlIIIIIl();
        if (this.IlIlIllllllllIIIIlII) {
            this.llIIIlIlIllIIlIlIlII.llIIlIIIlIIIllIlIIIl = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gui.done", new Object[0]);
        }
        else {
            this.llIIIlIlIllIIlIlIlII.llIIlIIIlIIIllIlIIIl = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("selectWorld.moreWorldOptions", new Object[0]);
        }
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final char c, final int n) {
        if (this.llllIIIlIlllIlIIIIIl.llIllIlIIIIllIlIIllI() && !this.IlIlIllllllllIIIIlII) {
            this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(c, n);
            this.IIIIIllIIIIlIIIIllIl = this.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl();
        }
        else if (this.lIIIIlIIIIIlllIllIII.llIllIlIIIIllIlIIllI() && this.IlIlIllllllllIIIIlII) {
            this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(c, n);
            this.IlIIIlIIIllllIlIlIlI = this.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl();
        }
        if (n == 28 || n == 156) {
            this.llllIIIIlIIIlIlllIll(this.IIlllIIlIllIllIlIIll.get(0));
        }
        this.IIlllIIlIllIllIlIIll.get(0).lIlIlIIIllIIllIIIllI = (this.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl().length() > 0);
        this.IlIlIIIllIllIIIIIllI();
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
        if (this.IlIlIllllllllIIIIlII) {
            this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(n, n2, n3);
        }
        else {
            this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(n, n2, n3);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        this.IlIlIIIllIIllIlllllI();
        this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("selectWorld.create", new Object[0]), this.llllIIllllIlIlIIIIll / 2, 20, -1);
        if (this.IlIlIllllllllIIIIlII) {
            this.IlIlIlIlIlllllllllIl(this.IIllIIllIIIlIlIIIIlI, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("selectWorld.enterSeed", new Object[0]), this.llllIIllllIlIlIIIIll / 2 - 100, 47, -6250336);
            this.IlIlIlIlIlllllllllIl(this.IIllIIllIIIlIlIIIIlI, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("selectWorld.seedInfo", new Object[0]), this.llllIIllllIlIlIIIIll / 2 - 100, 85, -6250336);
            if (this.lllllIlIIIlIlIIlllII.IlIlIIIllIIllIlllllI) {
                this.IlIlIlIlIlllllllllIl(this.IIllIIllIIIlIlIIIIlI, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("selectWorld.mapFeatures.info", new Object[0]), this.llllIIllllIlIlIIIIll / 2 - 150, 122, -6250336);
            }
            if (this.IIlllIIIlIlllIIlllII.IlIlIIIllIIllIlllllI) {
                this.IlIlIlIlIlllllllllIl(this.IIllIIllIIIlIlIIIIlI, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("selectWorld.allowCommands.info", new Object[0]), this.llllIIllllIlIlIIIIll / 2 - 150, 172, -6250336);
            }
            this.lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl();
            if (llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll[this.IIIIIIIIIlllIllIlIlI].lIIIIlIIIIIlllIllIII()) {
                this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll[this.IIIIIIIIIlllIllIlIlI].llIllIIIIIllIlIIIIlI(), new Object[0]), this.llIIlllIIlllIIllIllI.lIIIIlIIIIIlllIllIII + 2, this.llIIlllIIlllIIllIllI.lIIIlllIIIllIIIllIII + 22, this.llIIlllIIlllIIllIllI.IlIlIlIlIlllllllllIl(), 10526880);
            }
        }
        else {
            this.IlIlIlIlIlllllllllIl(this.IIllIIllIIIlIlIIIIlI, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("selectWorld.enterName", new Object[0]), this.llllIIllllIlIlIIIIll / 2 - 100, 47, -6250336);
            this.IlIlIlIlIlllllllllIl(this.IIllIIllIIIlIlIIIIlI, String.valueOf(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("selectWorld.resultFolder", new Object[0])) + " " + this.lIIIlllIIIllIIIllIII, this.llllIIllllIlIlIIIIll / 2 - 100, 85, -6250336);
            this.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl();
            this.IlIlIlIlIlllllllllIl(this.IIllIIllIIIlIlIIIIlI, this.llllllIllIllIlIllllI, this.llllIIllllIlIlIIIIll / 2 - 100, 137, -6250336);
            this.IlIlIlIlIlllllllllIl(this.IIllIIllIIIlIlIIIIlI, this.IIIllllllIllIIIlllIl, this.llllIIllllIlIlIIIIll / 2 - 100, 149, -6250336);
        }
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
    }
    
    public void llllIIIIlIIIlIlllIll(final llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll) {
        this.IIIIIllIIIIlIIIIllIl = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("selectWorld.newWorld.copyOf", llllIIllllIlIlIIIIll.llIIlIIIlIIIllIlIIIl());
        this.IlIIIlIIIllllIlIlIlI = new StringBuilder(String.valueOf(llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl())).toString();
        this.IIIIIIIIIlllIllIlIlI = llllIIllllIlIlIIIIll.IIllIIllIIIlIlIIIIlI().llllIIIlIlllIlIIIIIl();
        this.IlIlIIIllIllIIIIIllI = llllIIllllIlIlIIIIll.IIlllIlIIllIlIlIlIIl();
        this.lIlIlIIIllIIllIIIllI = llllIIllllIlIlIIIIll.lllIIIIlllllIlIIllIl();
        this.IIIlIIIlIlIIlllIIlll = llllIIllllIlIlIIIIll.IIIlIIIlIlIIlllIIlll();
        if (llllIIllllIlIlIIIIll.IlIlIIIIIIlllIlIllIl()) {
            this.llIIlIIIlIIIllIlIIIl = "hardcore";
        }
        else if (llllIIllllIlIlIIIIll.IIlllIIlIllIllIlIIll().IlIlIIIllIllIIIIIllI()) {
            this.llIIlIIIlIIIllIlIIIl = "survival";
        }
        else if (llllIIllllIlIlIIIIll.IIlllIIlIllIllIlIIll().IlIIIlIlIIIllIlIlIIl()) {
            this.llIIlIIIlIIIllIlIIIl = "creative";
        }
    }
}
