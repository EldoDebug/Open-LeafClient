package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import org.apache.logging.log4j.*;
import com.google.common.collect.*;
import org.lwjgl.input.*;
import java.util.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import leaf.*;
import org.apache.commons.lang3.*;

public class llllIIIlIlllIlIIIIIl extends lIIllIIIllllIlllIllI
{
    private static final Logger IllIIlllIIIIlllIIlIl;
    private String llllIIIlIlllIlIIIIIl;
    private int lIIIIlIIIIIlllIllIII;
    private boolean lIIIlllIIIllIIIllIII;
    private boolean llIIlIIIlIIIllIlIIIl;
    private int llIllIlIIIIllIlIIllI;
    private List lIlIlIIIllIIllIIIllI;
    protected lIIlIIIIIIIlIIlIlIIl IlIlIIIllIllIIIIIllI;
    private String IIIlIIIlIlIIlllIIlll;
    
    static {
        IllIIlllIIIIlllIIlIl = LogManager.getLogger();
    }
    
    public llllIIIlIlllIlIIIIIl() {
        this.llllIIIlIlllIlIIIIIl = "";
        this.lIIIIlIIIIIlllIllIII = -1;
        this.lIlIlIIIllIIllIIIllI = Lists.newArrayList();
        this.IIIlIIIlIlIIlllIIlll = "";
    }
    
    public llllIIIlIlllIlIIIIIl(final String iiIlIIIlIlIIlllIIlll) {
        this.llllIIIlIlllIlIIIIIl = "";
        this.lIIIIlIIIIIlllIllIII = -1;
        this.lIlIlIIIllIIllIIIllI = Lists.newArrayList();
        this.IIIlIIIlIlIIlllIIlll = "";
        this.IIIlIIIlIlIIlllIIlll = iiIlIIIlIlIIlllIIlll;
    }
    
    @Override
    public void n_() {
        Keyboard.enableRepeatEvents(true);
        this.lIIIIlIIIIIlllIllIII = this.IlIlIIIllIIllIlllllI.lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl().llIllIIIIIllIlIIIIlI().size();
        (this.IlIlIIIllIllIIIIIllI = new lIIlIIIIIIIlIIlIlIIl(0, this.IIllIIllIIIlIlIIIIlI, 4, this.IlIllIlIlIIIlIlIlIII - 12, this.llllIIllllIlIlIIIIll - 4, 12)).IllIIlllIIIIlllIIlIl(100);
        this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(false);
        this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl(true);
        this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(this.IIIlIIIlIlIIlllIIlll);
        this.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl(false);
    }
    
    @Override
    public void o_() {
        Keyboard.enableRepeatEvents(false);
        this.IlIlIIIllIIllIlllllI.lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl().IlIIIlIlIIIllIlIlIIl();
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll();
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final char c, final int n) {
        this.llIIlIIIlIIIllIlIIIl = false;
        if (n == 15) {
            this.IlIlIIIllIllIIIIIllI();
        }
        else {
            this.lIIIlllIIIllIIIllIII = false;
        }
        if (n == 1) {
            this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll((lIIllIIIllllIlllIllI)null);
        }
        else if (n != 28 && n != 156) {
            if (n == 200) {
                this.llllIIIIlIIIlIlllIll(-1);
            }
            else if (n == 208) {
                this.llllIIIIlIIIlIlllIll(1);
            }
            else if (n == 201) {
                this.IlIlIIIllIIllIlllllI.lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl().IlIlIlIlIlllllllllIl(this.IlIlIIIllIIllIlllllI.lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl().lIIIlllIIIllIIIllIII() - 1);
            }
            else if (n == 209) {
                this.IlIlIIIllIIllIlllllI.lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl().IlIlIlIlIlllllllllIl(-this.IlIlIIIllIIllIlllllI.lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl().lIIIlllIIIllIIIllIII() + 1);
            }
            else {
                this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(c, n);
            }
        }
        else {
            final String trim = this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl().trim();
            if (trim.length() > 0) {
                this.IlIlIIIllIllIIIIIllI(trim);
            }
            this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll((lIIllIIIllllIlllIllI)null);
        }
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl() {
        super.IlIlIlIlIlllllllllIl();
        int eventDWheel = Mouse.getEventDWheel();
        if (eventDWheel != 0) {
            if (eventDWheel > 1) {
                eventDWheel = 1;
            }
            if (eventDWheel < -1) {
                eventDWheel = -1;
            }
            if (!lIIllIIIllllIlllIllI.llllIIllllIlIlIIIIll()) {
                eventDWheel *= 7;
            }
            this.IlIlIIIllIIllIlllllI.lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl().IlIlIlIlIlllllllllIl(eventDWheel);
        }
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        if (n3 == 0 && this.llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI.lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl().llllIIIIlIIIlIlllIll(Mouse.getX(), Mouse.getY()))) {
            return;
        }
        this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(n, n2, n3);
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final String s, final boolean b) {
        if (b) {
            this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(s);
        }
        else {
            this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl(s);
        }
    }
    
    public void IlIlIIIllIllIIIIIllI() {
        if (this.lIIIlllIIIllIIIllIII) {
            this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl(this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(-1, this.IlIlIIIllIllIIIIIllI.lIIIlllIIIllIIIllIII(), false) - this.IlIlIIIllIllIIIIIllI.lIIIlllIIIllIIIllIII());
            if (this.llIllIlIIIIllIlIIllI >= this.lIlIlIIIllIIllIIIllI.size()) {
                this.llIllIlIIIIllIlIIllI = 0;
            }
        }
        else {
            final int llllIIIIlIIIlIlllIll = this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(-1, this.IlIlIIIllIllIIIIIllI.lIIIlllIIIllIIIllIII(), false);
            this.lIlIlIIIllIIllIIIllI.clear();
            this.llIllIlIIIIllIlIIllI = 0;
            this.llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl().substring(0, this.IlIlIIIllIllIIIIIllI.lIIIlllIIIllIIIllIII()), this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl().substring(llllIIIIlIIIlIlllIll).toLowerCase());
            if (this.lIlIlIIIllIIllIIIllI.isEmpty()) {
                return;
            }
            this.lIIIlllIIIllIIIllIII = true;
            this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll - this.IlIlIIIllIllIIIIIllI.lIIIlllIIIllIIIllIII());
        }
        if (this.lIlIlIIIllIIllIIIllI.size() > 1) {
            final StringBuilder sb = new StringBuilder();
            for (final String s : this.lIlIlIIIllIIllIIIllI) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(s);
            }
            this.IlIlIIIllIIllIlllllI.lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl().llllIIIIlIIIlIlllIll(new IlIlIIIIIIlllIlIllIl(sb.toString()), 1);
        }
        this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl(this.lIlIlIIIllIIllIIIllI.get(this.llIllIlIIIIllIlIIllI++));
    }
    
    private void llllIIIIlIIIlIlllIll(final String s, final String s2) {
        if (s.length() >= 1) {
            IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = null;
            if (this.IlIlIIIllIIllIlllllI.IIllIIllIIIlIlIIIIlI != null && this.IlIlIIIllIIllIlllllI.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll == lllllIlIlIlllIlllIlI.IlIlIlIlIlllllllllIl) {
                llllIIIIlIIIlIlllIll = this.IlIlIIIllIIllIlllllI.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll();
            }
            this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new IIlIIIIlllIlllllIlII(s, llllIIIIlIIIlIlllIll));
            this.llIIlIIIlIIIllIlIIIl = true;
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final int n) {
        final int n2 = this.lIIIIlIIIIIlllIllIII + n;
        final int size = this.IlIlIIIllIIllIlllllI.lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl().llIllIIIIIllIlIIIIlI().size();
        final int llllIIIIlIIIlIlllIll = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n2, 0, size);
        if (llllIIIIlIIIlIlllIll != this.lIIIIlIIIIIlllIllIII) {
            if (llllIIIIlIIIlIlllIll == size) {
                this.lIIIIlIIIIIlllIllIII = size;
                this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl);
            }
            else {
                if (this.lIIIIlIIIIIlllIllIII == size) {
                    this.llllIIIlIlllIlIIIIIl = this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl();
                }
                this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll((String)this.IlIlIIIllIIllIlllllI.lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl().llIllIIIIIllIlIIIIlI().get(llllIIIIlIIIlIlllIll));
                this.lIIIIlIIIIIlllIllIII = llllIIIIlIIIlIlllIll;
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        if (!Leaf.instance.modManager.chatMod.background) {
            net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(2, this.IlIllIlIlIIIlIlIlIII - 14, this.llllIIllllIlIlIIIIll - 2, this.IlIllIlIlIIIlIlIlIII - 2, Integer.MIN_VALUE);
        }
        this.IlIlIIIllIllIIIIIllI.llllIIIlIlllIlIIIIIl();
        final llIIIIIIlIllIIlIIIll llllIIIIlIIIlIlllIll = this.IlIlIIIllIIllIlllllI.lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl().llllIIIIlIIIlIlllIll(Mouse.getX(), Mouse.getY());
        if (llllIIIIlIIIlIlllIll != null && llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl().lIIIlllIIIllIIIllIII() != null) {
            this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, n, n2);
        }
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
    }
    
    public void llllIIIIlIIIlIlllIll(final String[] array) {
        if (this.llIIlIIIlIIIllIlIIIl) {
            this.lIIIlllIIIllIIIllIII = false;
            this.lIlIlIIIllIIllIIIllI.clear();
            for (final String s : array) {
                if (s.length() > 0) {
                    this.lIlIlIIIllIIllIIIllI.add(s);
                }
            }
            final String substring = this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl().substring(this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(-1, this.IlIlIIIllIllIIIIIllI.lIIIlllIIIllIIIllIII(), false));
            final String commonPrefix = StringUtils.getCommonPrefix(array);
            if (commonPrefix.length() > 0 && !substring.equalsIgnoreCase(commonPrefix)) {
                this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl(this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(-1, this.IlIlIIIllIllIIIIIllI.lIIIlllIIIllIIIllIII(), false) - this.IlIlIIIllIllIIIIIllI.lIIIlllIIIllIIIllIII());
                this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl(commonPrefix);
            }
            else if (this.lIlIlIIIllIIllIIIllI.size() > 0) {
                this.lIIIlllIIIllIIIllIII = true;
                this.IlIlIIIllIllIIIIIllI();
            }
        }
    }
    
    @Override
    public boolean IllIIlllIIIIlllIIlIl() {
        return false;
    }
}
