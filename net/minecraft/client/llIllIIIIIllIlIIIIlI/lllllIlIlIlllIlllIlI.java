package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import org.apache.logging.log4j.*;
import java.text.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.client.*;
import java.util.*;
import org.apache.commons.lang3.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.*;

public class lllllIlIlIlllIlllIlI extends lIIllIIIllllIlllIllI implements c
{
    private static final Logger IllIIlllIIIIlllIIlIl;
    private final DateFormat llllIIIlIlllIlIIIIIl;
    protected String IlIlIIIllIllIIIIIllI;
    private boolean lIIIIlIIIIIlllIllIII;
    private int lIIIlllIIIllIIIllIII;
    private List llIIlIIIlIIIllIlIIIl;
    private IlIllllIIlIllIlIlIll llIllIlIIIIllIlIIllI;
    private String lIlIlIIIllIIllIIIllI;
    private String IIIlIIIlIlIIlllIIlll;
    private String[] IlIlIIIlIIlIlIIlllIl;
    private boolean IlllllllIIIlIIIlIlII;
    private IlIIIlIlIIIllIlIlIIl IIlIIIIlllIlllllIlII;
    private IlIIIlIlIIIllIlIlIIl IIIlIIlIIIIlllIlllII;
    private IlIIIlIlIIIllIlIlIIl IlIlIllllllllIIIIlII;
    private IlIIIlIlIIIllIlIlIIl IIlllIlIIllIlIlIlIIl;
    
    static {
        IllIIlllIIIIlllIIlIl = LogManager.getLogger();
    }
    
    public lllllIlIlIlllIlllIlI() {
        this.llllIIIlIlllIlIIIIIl = new SimpleDateFormat();
        this.IlIlIIIllIllIIIIIllI = "Select world";
        this.IlIlIIIlIIlIlIIlllIl = new String[4];
    }
    
    @Override
    public void n_() {
        this.IlIlIIIllIllIIIIIllI = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("selectWorld.title", new Object[0]);
        try {
            this.llllIIIlIlllIlIIIIIl();
        }
        catch (llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
            lllllIlIlIlllIlllIlI.IllIIlllIIIIlllIIlIl.error("Couldn't load level list", (Throwable)llllIIIIlIIIlIlllIll);
            this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(new IlIlIIIlIIlIlIIlllIl("Unable to load worlds", llllIIIIlIIIlIlllIll.getMessage()));
            return;
        }
        this.lIlIlIIIllIIllIIIllI = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("selectWorld.world", new Object[0]);
        this.IIIlIIIlIlIIlllIIlll = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("selectWorld.conversion", new Object[0]);
        this.IlIlIIIlIIlIlIIlllIl[lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll()] = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gameMode.survival", new Object[0]);
        this.IlIlIIIlIIlIlIIlllIl[lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll()] = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gameMode.creative", new Object[0]);
        this.IlIlIIIlIIlIlIIlllIl[lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll()] = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gameMode.adventure", new Object[0]);
        this.IlIlIIIlIIlIlIIlllIl[lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll()] = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gameMode.spectator", new Object[0]);
        (this.llIllIlIIIIllIlIIllI = new IlIllllIIlIllIlIlIll(this, this.IlIlIIIllIIllIlllllI)).IlIIIlIlIIIllIlIlIIl(4, 5);
        this.IlIlIIIllIllIIIIIllI();
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl() {
        super.IlIlIlIlIlllllllllIl();
        this.llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII();
    }
    
    private void llllIIIlIlllIlIIIIIl() {
        Collections.sort((List<Comparable>)(this.llIIlIIIlIIIllIlIIIl = this.IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl().IlIlIlIlIlllllllllIl()));
        this.lIIIlllIIIllIIIllIII = -1;
    }
    
    protected String llllIIIIlIIIlIlllIll(final int n) {
        return this.llIIlIIIlIIIllIlIIIl.get(n).llllIIIIlIIIlIlllIll();
    }
    
    protected String lIIIIlIIIIIlllIllIII(final int n) {
        String s = this.llIIlIIIlIIIllIlIIIl.get(n).IlIlIlIlIlllllllllIl();
        if (StringUtils.isEmpty((CharSequence)s)) {
            s = String.valueOf(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("selectWorld.world", new Object[0])) + " " + (n + 1);
        }
        return s;
    }
    
    public void IlIlIIIllIllIIIIIllI() {
        this.IIlllIIlIllIllIlIIll.add(this.IIIlIIlIIIIlllIlllII = new IlIIIlIlIIIllIlIlIIl(1, this.llllIIllllIlIlIIIIll / 2 - 154, this.IlIllIlIlIIIlIlIlIII - 52, 150, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("selectWorld.select", new Object[0])));
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(3, this.llllIIllllIlIlIIIIll / 2 + 4, this.IlIllIlIlIIIlIlIlIII - 52, 150, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("selectWorld.create", new Object[0])));
        this.IIlllIIlIllIllIlIIll.add(this.IlIlIllllllllIIIIlII = new IlIIIlIlIIIllIlIlIIl(6, this.llllIIllllIlIlIIIIll / 2 - 154, this.IlIllIlIlIIIlIlIlIII - 28, 72, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("selectWorld.rename", new Object[0])));
        this.IIlllIIlIllIllIlIIll.add(this.IIlIIIIlllIlllllIlII = new IlIIIlIlIIIllIlIlIIl(2, this.llllIIllllIlIlIIIIll / 2 - 76, this.IlIllIlIlIIIlIlIlIII - 28, 72, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("selectWorld.delete", new Object[0])));
        this.IIlllIIlIllIllIlIIll.add(this.IIlllIlIIllIlIlIlIIl = new IlIIIlIlIIIllIlIlIIl(7, this.llllIIllllIlIlIIIIll / 2 + 4, this.IlIllIlIlIIIlIlIlIII - 28, 72, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("selectWorld.recreate", new Object[0])));
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(0, this.llllIIllllIlIlIIIIll / 2 + 82, this.IlIllIlIlIIIlIlIlIII - 28, 72, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gui.cancel", new Object[0])));
        this.IIIlIIlIIIIlllIlllII.lIlIlIIIllIIllIIIllI = false;
        this.IIlIIIIlllIlllllIlII.lIlIlIIIllIIllIIIllI = false;
        this.IlIlIllllllllIIIIlII.lIlIlIIIllIIllIIIllI = false;
        this.IIlllIlIIllIlIlIlIIl.lIlIlIIIllIIllIIIllI = false;
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (ilIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI) {
            if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 2) {
                final String liiiIlIIIIIlllIllIII = this.lIIIIlIIIIIlllIllIII(this.lIIIlllIIIllIIIllIII);
                if (liiiIlIIIIIlllIllIII != null) {
                    this.IlllllllIIIlIIIlIlII = true;
                    this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(this, liiiIlIIIIIlllIllIII, this.lIIIlllIIIllIIIllIII));
                }
            }
            else if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 1) {
                this.lIIIlllIIIllIIIllIII(this.lIIIlllIIIllIIIllIII);
            }
            else if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 3) {
                this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(new IIIIlllIIIIIIlIIIlll(this));
            }
            else if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 6) {
                this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(new IlIIlllllIIllIIlllll(this, this.llllIIIIlIIIlIlllIll(this.lIIIlllIIIllIIIllIII)));
            }
            else if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 0) {
                this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll((lIIllIIIllllIlllIllI)null);
            }
            else if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 7) {
                final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = new IIIIlllIIIIIIlIIIlll(this);
                final net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = this.IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl().llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll(this.lIIIlllIIIllIIIllIII), false);
                final llllIIllllIlIlIIIIll llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
                llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
                iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI);
                this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
            }
            else {
                this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl);
            }
        }
    }
    
    public void lIIIlllIIIllIIIllIII(final int n) {
        this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll((lIIllIIIllllIlllIllI)null);
        if (!this.lIIIIlIIIIIlllIllIII) {
            this.lIIIIlIIIIIlllIllIII = true;
            String s = this.llllIIIIlIIIlIlllIll(n);
            if (s == null) {
                s = "World" + n;
            }
            String s2 = this.lIIIIlIIIIIlllIllIII(n);
            if (s2 == null) {
                s2 = "World" + n;
            }
            if (this.IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl().IllIIlllIIIIlllIIlIl(s)) {
                this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(s, s2, null);
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final boolean b, final int n) {
        if (this.IlllllllIIIlIIIlIlII) {
            this.IlllllllIIIlIIIlIlII = false;
            if (b) {
                final net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI illIIlllIIIIlllIIlIl = this.IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl();
                illIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl();
                illIIlllIIIIlllIIlIl.IlIlIIIllIllIIIIIllI(this.llllIIIIlIIIlIlllIll(n));
                try {
                    this.llllIIIlIlllIlIIIIIl();
                }
                catch (llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
                    lllllIlIlIlllIlllIlI.IllIIlllIIIIlllIIlIl.error("Couldn't load level list", (Throwable)llllIIIIlIIIlIlllIll);
                }
            }
            this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(this);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(n, n2, n3);
        this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, this.IlIlIIIllIllIIIIIllI, this.llllIIllllIlIlIIIIll / 2, 20, 16777215);
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
    }
    
    public static b llllIIIIlIIIlIlllIll(final c c, final String s, final int n) {
        return new b(c, llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("selectWorld.deleteQuestion", new Object[0]), "'" + s + "' " + llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("selectWorld.deleteWarning", new Object[0]), llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("selectWorld.deleteButton", new Object[0]), llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gui.cancel", new Object[0]), n);
    }
}
