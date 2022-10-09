package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import org.apache.logging.log4j.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import org.lwjgl.input.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import io.netty.buffer.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import com.google.gson.*;
import com.google.common.collect.*;
import net.minecraft.lIIIIlIIIIIlllIllIII.*;
import java.util.*;

public class llIllIIlllllllllllll extends lIIllIIIllllIlllIllI
{
    private static final Logger IlIlIIIllIllIIIIIllI;
    private static final lIllllIllIllIIllllll IllIIlllIIIIlllIIlIl;
    private final llllIIIIlIIIlIlllIll llllIIIlIlllIlIIIIIl;
    private final lllIIIIlIlIllIIlIIIl lIIIIlIIIIIlllIllIII;
    private final boolean lIIIlllIIIllIIIllIII;
    private boolean llIIlIIIlIIIllIlIIIl;
    private boolean llIllIlIIIIllIlIIllI;
    private int lIlIlIIIllIIllIIIllI;
    private int IIIlIIIlIlIIlllIIlll;
    private int IlIlIIIlIIlIlIIlllIl;
    private int IlllllllIIIlIIIlIlII;
    private int IIlIIIIlllIlllllIlII;
    private IlIlIIIlIIlIlIIlllIl IIIlIIlIIIIlllIlllII;
    private String IlIlIllllllllIIIIlII;
    private List IIlllIlIIllIlIlIlIIl;
    private int llIIIlIlIllIIlIlIlII;
    private lllllIIllIlIllIllllI lllllIlIIIlIlIIlllII;
    private lllllIIllIlIllIllllI lIllllllIIllIlIlIlII;
    private IlIIIlIlIIIllIlIlIIl llIIlllIIlllIIllIllI;
    private IlIIIlIlIIIllIlIlIIl IIlllIIIlIlllIIlllII;
    private IlIIIlIlIIIllIlIlIIl IIlIIIIIllIlIIIlIIll;
    private IlIIIlIlIIIllIlIlIIl llllllIllIllIlIllllI;
    
    static {
        IlIlIIIllIllIIIIIllI = LogManager.getLogger();
        IllIIlllIIIIlllIIlIl = new lIllllIllIllIIllllll("textures/gui/book.png");
    }
    
    public llIllIIlllllllllllll(final llllIIIIlIIIlIlllIll llllIIIlIlllIlIIIIIl, final lllIIIIlIlIllIIlIIIl liiiIlIIIIIlllIllIII, final boolean liiIlllIIIllIIIllIII) {
        this.IIIlIIIlIlIIlllIIlll = 192;
        this.IlIlIIIlIIlIlIIlllIl = 192;
        this.IlllllllIIIlIIIlIlII = 1;
        this.IlIlIllllllllIIIIlII = "";
        this.llIIIlIlIllIIlIlIlII = -1;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        if (liiiIlIIIIIlllIllIII.IIIIlllIIIIIIlIIIlll()) {
            this.IIIlIIlIIIIlllIlllII = liiiIlIIIIIlllIllIII.llllIIllllIlIlIIIIll().llIllIIIIIllIlIIIIlI("pages", 8);
            if (this.IIIlIIlIIIIlllIlllII != null) {
                this.IIIlIIlIIIIlllIlllII = (IlIlIIIlIIlIlIIlllIl)this.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl();
                this.IlllllllIIIlIIIlIlII = this.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI();
                if (this.IlllllllIIIlIIIlIlII < 1) {
                    this.IlllllllIIIlIIIlIlII = 1;
                }
            }
        }
        if (this.IIIlIIlIIIIlllIlllII == null && liiIlllIIIllIIIllIII) {
            (this.IIIlIIlIIIIlllIlllII = new IlIlIIIlIIlIlIIlllIl()).llllIIIIlIIIlIlllIll(new IIIlIIlIIIIlllIlllII(""));
            this.IlllllllIIIlIIIlIlII = 1;
        }
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        super.IlIIIlIlIIIllIlIlIIl();
        ++this.lIlIlIIIllIIllIIIllI;
    }
    
    @Override
    public void n_() {
        this.IIlllIIlIllIllIlIIll.clear();
        Keyboard.enableRepeatEvents(true);
        if (this.lIIIlllIIIllIIIllIII) {
            this.IIlllIIlIllIllIlIIll.add(this.IIlllIIIlIlllIIlllII = new IlIIIlIlIIIllIlIlIIl(3, this.llllIIllllIlIlIIIIll / 2 - 100, 4 + this.IlIlIIIlIIlIlIIlllIl, 98, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("book.signButton", new Object[0])));
            this.IIlllIIlIllIllIlIIll.add(this.llIIlllIIlllIIllIllI = new IlIIIlIlIIIllIlIlIIl(0, this.llllIIllllIlIlIIIIll / 2 + 2, 4 + this.IlIlIIIlIIlIlIIlllIl, 98, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gui.done", new Object[0])));
            this.IIlllIIlIllIllIlIIll.add(this.IIlIIIIIllIlIIIlIIll = new IlIIIlIlIIIllIlIlIIl(5, this.llllIIllllIlIlIIIIll / 2 - 100, 4 + this.IlIlIIIlIIlIlIIlllIl, 98, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("book.finalizeButton", new Object[0])));
            this.IIlllIIlIllIllIlIIll.add(this.llllllIllIllIlIllllI = new IlIIIlIlIIIllIlIlIIl(4, this.llllIIllllIlIlIIIIll / 2 + 2, 4 + this.IlIlIIIlIIlIlIIlllIl, 98, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gui.cancel", new Object[0])));
        }
        else {
            this.IIlllIIlIllIllIlIIll.add(this.llIIlllIIlllIIllIllI = new IlIIIlIlIIIllIlIlIIl(0, this.llllIIllllIlIlIIIIll / 2 - 100, 4 + this.IlIlIIIlIIlIlIIlllIl, 200, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gui.done", new Object[0])));
        }
        final int n = (this.llllIIllllIlIlIIIIll - this.IIIlIIIlIlIIlllIIlll) / 2;
        final int n2 = 2;
        this.IIlllIIlIllIllIlIIll.add(this.lllllIlIIIlIlIIlllII = new lllllIIllIlIllIllllI(1, n + 120, n2 + 154, true));
        this.IIlllIIlIllIllIlIIll.add(this.lIllllllIIllIlIlIlII = new lllllIIllIlIllIllllI(2, n + 38, n2 + 154, false));
        this.llllIIIlIlllIlIIIIIl();
    }
    
    @Override
    public void o_() {
        Keyboard.enableRepeatEvents(false);
    }
    
    private void llllIIIlIlllIlIIIIIl() {
        this.lllllIlIIIlIlIIlllII.IlIlIIIllIIllIlllllI = (!this.llIllIlIIIIllIlIIllI && (this.IIlIIIIlllIlllllIlII < this.IlllllllIIIlIIIlIlII - 1 || this.lIIIlllIIIllIIIllIII));
        this.lIllllllIIllIlIlIlII.IlIlIIIllIIllIlllllI = (!this.llIllIlIIIIllIlIIllI && this.IIlIIIIlllIlllllIlII > 0);
        this.llIIlllIIlllIIllIllI.IlIlIIIllIIllIlllllI = (!this.lIIIlllIIIllIIIllIII || !this.llIllIlIIIIllIlIIllI);
        if (this.lIIIlllIIIllIIIllIII) {
            this.IIlllIIIlIlllIIlllII.IlIlIIIllIIllIlllllI = !this.llIllIlIIIIllIlIIllI;
            this.llllllIllIllIlIllllI.IlIlIIIllIIllIlllllI = this.llIllIlIIIIllIlIIllI;
            this.IIlIIIIIllIlIIIlIIll.IlIlIIIllIIllIlllllI = this.llIllIlIIIIllIlIIllI;
            this.IIlIIIIIllIlIIIlIIll.lIlIlIIIllIIllIIIllI = (this.IlIlIllllllllIIIIlII.trim().length() > 0);
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final boolean b) {
        if (this.lIIIlllIIIllIIIllIII && this.llIIlIIIlIIIllIlIIIl && this.IIIlIIlIIIIlllIlllII != null) {
            while (this.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI() > 1 && this.IIIlIIlIIIIlllIlllII.IllIIlllIIIIlllIIlIl(this.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI() - 1).length() == 0) {
                this.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll(this.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI() - 1);
            }
            if (this.lIIIIlIIIIIlllIllIII.IIIIlllIIIIIIlIIIlll()) {
                this.lIIIIlIIIIIlllIllIII.llllIIllllIlIlIIIIll().llllIIIIlIIIlIlllIll("pages", this.IIIlIIlIIIIlllIlllII);
            }
            else {
                this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll("pages", this.IIIlIIlIIIIlllIlllII);
            }
            String s = "MC|BEdit";
            if (b) {
                s = "MC|BSign";
                this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll("author", new IIIlIIlIIIIlllIlllII(this.llllIIIlIlllIlIIIIIl.s_()));
                this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll("title", new IIIlIIlIIIIlllIlllII(this.IlIlIllllllllIIIIlII.trim()));
                for (int i = 0; i < this.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI(); ++i) {
                    this.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll(i, new IIIlIIlIIIIlllIlllII(lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(new IlIlIIIIIIlllIlIllIl(this.IIIlIIlIIIIlllIlllII.IllIIlllIIIIlllIIlIl(i)))));
                }
                this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.R);
            }
            final llllllIllIllIlIllllI llllllIllIllIlIllllI = new llllllIllIllIlIllllI(Unpooled.buffer());
            llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII);
            this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll().llllIIIIlIIIlIlllIll(new llIIIlIlIllIIlIlIlII(s, llllllIllIllIlIllllI));
        }
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (ilIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI) {
            if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 0) {
                this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll((lIIllIIIllllIlllIllI)null);
                this.llllIIIIlIIIlIlllIll(false);
            }
            else if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 3 && this.lIIIlllIIIllIIIllIII) {
                this.llIllIlIIIIllIlIIllI = true;
            }
            else if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 1) {
                if (this.IIlIIIIlllIlllllIlII < this.IlllllllIIIlIIIlIlII - 1) {
                    ++this.IIlIIIIlllIlllllIlII;
                }
                else if (this.lIIIlllIIIllIIIllIII) {
                    this.lIIIIlIIIIIlllIllIII();
                    if (this.IIlIIIIlllIlllllIlII < this.IlllllllIIIlIIIlIlII - 1) {
                        ++this.IIlIIIIlllIlllllIlII;
                    }
                }
            }
            else if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 2) {
                if (this.IIlIIIIlllIlllllIlII > 0) {
                    --this.IIlIIIIlllIlllllIlII;
                }
            }
            else if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 5 && this.llIllIlIIIIllIlIIllI) {
                this.llllIIIIlIIIlIlllIll(true);
                this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll((lIIllIIIllllIlllIllI)null);
            }
            else if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 4 && this.llIllIlIIIIllIlIIllI) {
                this.llIllIlIIIIllIlIIllI = false;
            }
            this.llllIIIlIlllIlIIIIIl();
        }
    }
    
    private void lIIIIlIIIIIlllIllIII() {
        if (this.IIIlIIlIIIIlllIlllII != null && this.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI() < 50) {
            this.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll(new IIIlIIlIIIIlllIlllII(""));
            ++this.IlllllllIIIlIIIlIlII;
            this.llIIlIIIlIIIllIlIIIl = true;
        }
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final char c, final int n) {
        super.llllIIIIlIIIlIlllIll(c, n);
        if (this.lIIIlllIIIllIIIllIII) {
            if (this.llIllIlIIIIllIlIIllI) {
                this.llIllIIIIIllIlIIIIlI(c, n);
            }
            else {
                this.IlIlIlIlIlllllllllIl(c, n);
            }
        }
    }
    
    private void IlIlIlIlIlllllllllIl(final char c, final int n) {
        if (lIIllIIIllllIlllIllI.IlIlIIIllIllIIIIIllI(n)) {
            this.IlIlIlIlIlllllllllIl(lIIllIIIllllIlllIllI.llIIlIIIlIIIllIlIIIl());
        }
        else {
            switch (n) {
                case 14: {
                    final String liiIlllIIIllIIIllIII = this.lIIIlllIIIllIIIllIII();
                    if (liiIlllIIIllIIIllIII.length() > 0) {
                        this.llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII.substring(0, liiIlllIIIllIIIllIII.length() - 1));
                    }
                }
                case 28:
                case 156: {
                    this.IlIlIlIlIlllllllllIl("\n");
                }
                default: {
                    if (net.minecraft.IlllllllIIIlIIIlIlII.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(c)) {
                        this.IlIlIlIlIlllllllllIl(Character.toString(c));
                        break;
                    }
                    break;
                }
            }
        }
    }
    
    private void llIllIIIIIllIlIIIIlI(final char c, final int n) {
        switch (n) {
            case 14: {
                if (!this.IlIlIllllllllIIIIlII.isEmpty()) {
                    this.IlIlIllllllllIIIIlII = this.IlIlIllllllllIIIIlII.substring(0, this.IlIlIllllllllIIIIlII.length() - 1);
                    this.llllIIIlIlllIlIIIIIl();
                }
            }
            case 28:
            case 156: {
                if (!this.IlIlIllllllllIIIIlII.isEmpty()) {
                    this.llllIIIIlIIIlIlllIll(true);
                    this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll((lIIllIIIllllIlllIllI)null);
                }
            }
            default: {
                if (this.IlIlIllllllllIIIIlII.length() < 16 && net.minecraft.IlllllllIIIlIIIlIlII.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(c)) {
                    this.IlIlIllllllllIIIIlII = String.valueOf(this.IlIlIllllllllIIIIlII) + Character.toString(c);
                    this.llllIIIlIlllIlIIIIIl();
                    this.llIIlIIIlIIIllIlIIIl = true;
                }
            }
        }
    }
    
    private String lIIIlllIIIllIIIllIII() {
        return (this.IIIlIIlIIIIlllIlllII != null && this.IIlIIIIlllIlllllIlII >= 0 && this.IIlIIIIlllIlllllIlII < this.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI()) ? this.IIIlIIlIIIIlllIlllII.IllIIlllIIIIlllIIlIl(this.IIlIIIIlllIlllllIlII) : "";
    }
    
    private void llllIIIIlIIIlIlllIll(final String s) {
        if (this.IIIlIIlIIIIlllIlllII != null && this.IIlIIIIlllIlllllIlII >= 0 && this.IIlIIIIlllIlllllIlII < this.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI()) {
            this.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll(this.IIlIIIIlllIlllllIlII, new IIIlIIlIIIIlllIlllII(s));
            this.llIIlIIIlIIIllIlIIIl = true;
        }
    }
    
    private void IlIlIlIlIlllllllllIl(final String s) {
        final String string = String.valueOf(this.lIIIlllIIIllIIIllIII()) + s;
        if (this.IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl(String.valueOf(string) + IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll + "_", 118) <= 128 && string.length() < 256) {
            this.llllIIIIlIIIlIlllIll(string);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
        this.IlIlIIIllIIllIlllllI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(llIllIIlllllllllllll.IllIIlllIIIIlllIIlIl);
        final int n4 = (this.llllIIllllIlIlIIIIll - this.IIIlIIIlIlIIlllIIlll) / 2;
        final int n5 = 2;
        this.IlIlIlIlIlllllllllIl(n4, n5, 0, 0, this.IIIlIIIlIlIIlllIIlll, this.IlIlIIIlIIlIlIIlllIl);
        if (this.llIllIlIIIIllIlIIllI) {
            String s = this.IlIlIllllllllIIIIlII;
            if (this.lIIIlllIIIllIIIllIII) {
                if (this.lIlIlIIIllIIllIIIllI / 6 % 2 == 0) {
                    s = String.valueOf(s) + IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll + "_";
                }
                else {
                    s = String.valueOf(s) + IlllIIIIlIIIlIlIlIIl.lIIIIlIIIIIlllIllIII + "_";
                }
            }
            final String llllIIIIlIIIlIlllIll = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("book.editTitle", new Object[0]);
            this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, n4 + 36 + (116 - this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll)) / 2, n5 + 16 + 16, 0);
            this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(s, n4 + 36 + (116 - this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(s)) / 2, n5 + 48, 0);
            final String llllIIIIlIIIlIlllIll2 = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("book.byAuthor", this.llllIIIlIlllIlIIIIIl.s_());
            this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(IlllIIIIlIIIlIlIlIIl.lIIIlllIIIllIIIllIII + llllIIIIlIIIlIlllIll2, n4 + 36 + (116 - this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2)) / 2, n5 + 48 + 10, 0);
            this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("book.finalizeWarning", new Object[0]), n4 + 36, n5 + 80, 116, 0);
        }
        else {
            final String llllIIIIlIIIlIlllIll3 = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("book.pageIndicator", this.IIlIIIIlllIlllllIlII + 1, this.IlllllllIIIlIIIlIlII);
            String s2 = "";
            if (this.IIIlIIlIIIIlllIlllII != null && this.IIlIIIIlllIlllllIlII >= 0 && this.IIlIIIIlllIlllllIlII < this.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI()) {
                s2 = this.IIIlIIlIIIIlllIlllII.IllIIlllIIIIlllIIlIl(this.IIlIIIIlllIlllllIlII);
            }
            if (this.lIIIlllIIIllIIIllIII) {
                if (this.IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl()) {
                    s2 = String.valueOf(s2) + "_";
                }
                else if (this.lIlIlIIIllIIllIIIllI / 6 % 2 == 0) {
                    s2 = String.valueOf(s2) + IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll + "_";
                }
                else {
                    s2 = String.valueOf(s2) + IlllIIIIlIIIlIlIlIIl.lIIIIlIIIIIlllIllIII + "_";
                }
            }
            else if (this.llIIIlIlIllIIlIlIlII != this.IIlIIIIlllIlllllIlII) {
                if (IlIllllIIlIIlIlIlIll.IlIlIlIlIlllllllllIl(this.lIIIIlIIIIIlllIllIII.llllIIllllIlIlIIIIll())) {
                    try {
                        final llIIIIIIlIllIIlIIIll llllIIIIlIIIlIlllIll4 = lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(s2);
                        this.IIlllIlIIllIlIlIlIIl = ((llllIIIIlIIIlIlllIll4 != null) ? IlIIlllIIlIlllllIIlI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll4, 116, this.IIllIIllIIIlIlIIIIlI, true, true) : null);
                    }
                    catch (JsonParseException ex) {
                        this.IIlllIlIIllIlIlIlIIl = null;
                    }
                }
                else {
                    this.IIlllIlIIllIlIlIlIIl = Lists.newArrayList((Iterable)new IlIlIIIIIIlllIlIllIl(String.valueOf(IlllIIIIlIIIlIlIlIIl.IlIlIIIllIllIIIIIllI.toString()) + "* Invalid book tag *"));
                }
                this.llIIIlIlIllIIlIlIlII = this.IIlIIIIlllIlllllIlII;
            }
            this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3, n4 - this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3) + this.IIIlIIIlIlIIlllIIlll - 44, n5 + 16, 0);
            if (this.IIlllIlIIllIlIlIlIIl == null) {
                this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(s2, n4 + 36, n5 + 16 + 16, 116, 0);
            }
            else {
                for (int min = Math.min(128 / this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll, this.IIlllIlIIllIlIlIlIIl.size()), i = 0; i < min; ++i) {
                    this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(((llIIIIIIlIllIIlIIIll)this.IIlllIlIIllIlIlIlIIl.get(i)).lIIIIlIIIIIlllIllIII(), n4 + 36, n5 + 16 + 16 + i * this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll, 0);
                }
                final llIIIIIIlIllIIlIIIll llllIIIIlIIIlIlllIll5 = this.llllIIIIlIIIlIlllIll(n, n2);
                if (llllIIIIlIIIlIlllIll5 != null) {
                    this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll5, n, n2);
                }
            }
        }
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        if (n3 == 0 && this.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll(n, n2))) {
            return;
        }
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
    }
    
    @Override
    protected boolean llllIIIIlIIIlIlllIll(final llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll) {
        final net.minecraft.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = (llIIIIIIlIllIIlIIIll == null) ? null : llIIIIIIlIllIIlIIIll.llllIIIlIlllIlIIIIIl().lIIIIlIIIIIlllIllIII();
        if (llllIIIIlIIIlIlllIll == null) {
            return false;
        }
        if (llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl) {
            final String ilIlIlIlIlllllllllIl = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
            try {
                final int iIlIIIIlllIlllllIlII = Integer.parseInt(ilIlIlIlIlllllllllIl) - 1;
                if (iIlIIIIlllIlllllIlII >= 0 && iIlIIIIlllIlllllIlII < this.IlllllllIIIlIIIlIlII && iIlIIIIlllIlllllIlII != this.IIlIIIIlllIlllllIlII) {
                    this.IIlIIIIlllIlllllIlII = iIlIIIIlllIlllllIlII;
                    this.llllIIIlIlllIlIIIIIl();
                    return true;
                }
            }
            catch (Throwable t) {}
            return false;
        }
        final boolean llllIIIIlIIIlIlllIll2 = super.llllIIIIlIIIlIlllIll(llIIIIIIlIllIIlIIIll);
        if (llllIIIIlIIIlIlllIll2 && llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI) {
            this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll((lIIllIIIllllIlllIllI)null);
        }
        return llllIIIIlIIIlIlllIll2;
    }
    
    public llIIIIIIlIllIIlIIIll llllIIIIlIIIlIlllIll(final int n, final int n2) {
        if (this.IIlllIlIIllIlIlIlIIl == null) {
            return null;
        }
        final int n3 = n - (this.llllIIllllIlIlIIIIll - this.IIIlIIIlIlIIlllIIlll) / 2 - 36;
        final int n4 = n2 - 2 - 16 - 16;
        if (n3 < 0 || n4 < 0) {
            return null;
        }
        final int min = Math.min(128 / this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll, this.IIlllIlIIllIlIlIlIIl.size());
        if (n3 <= 116 && n4 < this.IlIlIIIllIIllIlllllI.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll * min + min) {
            final int n5 = n4 / this.IlIlIIIllIIllIlllllI.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll;
            if (n5 >= 0 && n5 < this.IIlllIlIIllIlIlIlIIl.size()) {
                final llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll = this.IIlllIlIIllIlIlIlIIl.get(n5);
                int n6 = 0;
                for (final llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll2 : llIIIIIIlIllIIlIIIll) {
                    if (llIIIIIIlIllIIlIIIll2 instanceof IlIlIIIIIIlllIlIllIl) {
                        n6 += this.IlIlIIIllIIllIlllllI.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(((IlIlIIIIIIlllIlIllIl)llIIIIIIlIllIIlIIIll2).llllIIIIlIIIlIlllIll());
                        if (n6 > n3) {
                            return llIIIIIIlIllIIlIIIll2;
                        }
                        continue;
                    }
                }
            }
            return null;
        }
        return null;
    }
}
