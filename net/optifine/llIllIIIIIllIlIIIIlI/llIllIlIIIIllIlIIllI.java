package net.optifine.llIllIIIIIllIlIIIIlI;

import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import java.util.*;
import java.math.*;
import java.net.*;
import net.optifine.*;
import com.mojang.authlib.exceptions.*;

public class llIllIlIIIIllIlIIllI extends lIlIlIIIllIIllIIIllI
{
    private final lIIllIIIllllIlllIllI IlIlIIIllIllIIIIIllI;
    private String IllIIlllIIIIlllIIlIl;
    private String llllIIIlIlllIlIIIIIl;
    private long lIIIIlIIIIIlllIllIII;
    private String lIIIlllIIIllIIIllIII;
    private IlIlIlIlIlllllllllIl llIIlIIIlIIIllIlIIIl;
    private FontRenderer llIllIlIIIIllIlIIllI;
    
    public llIllIlIIIIllIlIIllI(final lIIllIIIllllIlllIllI ilIlIIIllIllIIIIIllI) {
        this.llIllIlIIIIllIlIIllI = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI().lIlIlIIIllIIllIIIllI;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    @Override
    public void n_() {
        int n = 0;
        this.IllIIlllIIIIlllIIlIl = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("of.options.capeOF.title", new Object[0]);
        n += 2;
        this.IIlllIIlIllIllIlIIll.add(new IlIlIlIlIlllllllllIl(210, this.llllIIllllIlIlIIIIll / 2 - 155, this.IlIllIlIlIIIlIlIlIII / 6 + 24 * (n >> 1), 150, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("of.options.capeOF.openEditor", new Object[0])));
        this.IIlllIIlIllIllIlIIll.add(new IlIlIlIlIlllllllllIl(220, this.llllIIllllIlIlIIIIll / 2 - 155 + 160, this.IlIllIlIlIIIlIlIlIII / 6 + 24 * (n >> 1), 150, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("of.options.capeOF.reloadCape", new Object[0])));
        n += 6;
        this.llIIlIIIlIIIllIlIIIl = new IlIlIlIlIlllllllllIl(230, this.llllIIllllIlIlIIIIll / 2 - 100, this.IlIllIlIlIIIlIlIlIII / 6 + 24 * (n >> 1), 200, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("of.options.capeOF.copyEditorLink", new Object[0]));
        this.llIIlIIIlIIIllIlIIIl.IlIlIIIllIIllIlllllI = (this.lIIIlllIIIllIIIllIII != null);
        this.IIlllIIlIllIllIlIIll.add(this.llIIlIIIlIIIllIlIIIl);
        n += 4;
        this.IIlllIIlIllIllIlIIll.add(new IlIlIlIlIlllllllllIl(200, this.llllIIllllIlIlIIIIll / 2 - 100, this.IlIllIlIlIIIlIlIlIII / 6 + 24 * (n >> 1), net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gui.done", new Object[0])));
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (ilIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI) {
            if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 200) {
                this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI);
            }
            if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 210) {
                try {
                    final String name = this.IlIlIIIllIIllIlllllI.IIIIIllIIIIlIIIIllIl().IlIlIIIllIllIIIIIllI().getName();
                    final String replace = this.IlIlIIIllIIllIlllllI.IIIIIllIIIIlIIIIllIl().IlIlIIIllIllIIIIIllI().getId().toString().replace("-", "");
                    final String ilIIIlIlIIIllIlIlIIl2 = this.IlIlIIIllIIllIlllllI.IIIIIllIIIIlIIIIllIl().IlIIIlIlIIIllIlIlIIl();
                    final String string = new BigInteger(128, new Random()).xor(new BigInteger(128, new Random(System.identityHashCode(new Object())))).toString(16);
                    this.IlIlIIIllIIllIlllllI.lIlIlIlllIIlIlIlllIl().joinServer(this.IlIlIIIllIIllIlllllI.IIIIIllIIIIlIIIIllIl().IlIlIIIllIllIIIIIllI(), ilIIIlIlIIIllIlIlIIl2, string);
                    final String string2 = "https://optifine.net/capeChange?u=" + replace + "&n=" + name + "&s=" + string;
                    if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new URI(string2))) {
                        this.llllIIIIlIIIlIlllIll(IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll("of.message.capeOF.openEditor"), 10000L);
                    }
                    else {
                        this.llllIIIIlIIIlIlllIll(IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll("of.message.capeOF.openEditorError"), 10000L);
                        this.llllIIIIlIIIlIlllIll(string2);
                    }
                }
                catch (InvalidCredentialsException ex) {
                    net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("of.message.capeOF.error1", new Object[0]), net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("of.message.capeOF.error2", ex.getMessage()));
                    net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Mojang authentication failed");
                    net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(String.valueOf(ex.getClass().getName()) + ": " + ex.getMessage());
                }
                catch (Exception ex2) {
                    net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Error opening OptiFine cape link");
                    net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(String.valueOf(ex2.getClass().getName()) + ": " + ex2.getMessage());
                }
            }
            if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 220) {
                this.llllIIIIlIIIlIlllIll(IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll("of.message.capeOF.reloadCape"), 15000L);
                if (this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII != null) {
                    this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(System.currentTimeMillis() + 15000L);
                }
            }
            if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 230 && this.lIIIlllIIIllIIIllIII != null) {
                lIIllIIIllllIlllIllI.IlIIIlIlIIIllIlIlIIl(this.lIIIlllIIIllIIIllIII);
            }
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final String llllIIIlIlllIlIIIIIl, final long n) {
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = System.currentTimeMillis() + n;
        this.llllIIIIlIIIlIlllIll((String)null);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        this.IlIlIIIllIIllIlllllI();
        this.llllIIIIlIIIlIlllIll(this.llIllIlIIIIllIlIIllI, this.IllIIlllIIIIlllIIlIl, this.llllIIllllIlIlIIIIll / 2, 20, 16777215);
        if (this.llllIIIlIlllIlIIIIIl != null) {
            this.llllIIIIlIIIlIlllIll(this.llIllIlIIIIllIlIIllI, this.llllIIIlIlllIlIIIIIl, this.llllIIllllIlIlIIIIll / 2, this.IlIllIlIlIIIlIlIlIII / 6 + 60, 16777215);
            if (System.currentTimeMillis() > this.lIIIIlIIIIIlllIllIII) {
                this.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl = null);
            }
        }
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
    }
    
    public void llllIIIIlIIIlIlllIll(final String liiIlllIIIllIIIllIII) {
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl.IlIlIIIllIIllIlllllI = (liiIlllIIIllIIIllIII != null);
    }
}
