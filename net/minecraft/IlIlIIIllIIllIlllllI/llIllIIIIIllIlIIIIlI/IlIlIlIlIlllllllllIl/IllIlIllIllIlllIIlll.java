package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;

import com.google.common.collect.*;
import net.minecraft.lllIIIIlllllIlIIllIl.*;
import java.util.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class IllIlIllIllIlllIIlll implements IIlIIIIIllIlIIIlIIll
{
    private String llllIIIIlIIIlIlllIll;
    private String IlIlIlIlIlllllllllIl;
    private String llIllIIIIIllIlIIIIlI;
    private String IlIIIlIlIIIllIlIlIIl;
    private String IlIlIIIllIllIIIIIllI;
    private int IllIIlllIIIIlllIIlIl;
    private Collection llllIIIlIlllIlIIIIIl;
    private int lIIIIlIIIIIlllIllIII;
    private int lIIIlllIIIllIIIllIII;
    
    public IllIlIllIllIlllIIlll() {
        this.llllIIIIlIIIlIlllIll = "";
        this.IlIlIlIlIlllllllllIl = "";
        this.llIllIIIIIllIlIIIIlI = "";
        this.IlIIIlIlIIIllIlIlIIl = "";
        this.IlIlIIIllIllIIIIIllI = IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = -1;
        this.llllIIIlIlllIlIIIIIl = Lists.newArrayList();
    }
    
    public IllIlIllIllIlllIIlll(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII, final int liiiIlIIIIIlllIllIII) {
        this.llllIIIIlIIIlIlllIll = "";
        this.IlIlIlIlIlllllllllIl = "";
        this.llIllIIIIIllIlIIIIlI = "";
        this.IlIIIlIlIIIllIlIlIIl = "";
        this.IlIlIIIllIllIIIIIllI = IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = -1;
        this.llllIIIlIlllIlIIIIIl = Lists.newArrayList();
        this.llllIIIIlIIIlIlllIll = liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll();
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        if (liiiIlIIIIIlllIllIII == 0 || liiiIlIIIIIlllIllIII == 2) {
            this.IlIlIlIlIlllllllllIl = liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl();
            this.llIllIIIIIllIlIIIIlI = liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl();
            this.IlIIIlIlIIIllIlIlIIl = liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI();
            this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl();
            this.IlIlIIIllIllIIIIIllI = liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII().IlIlIIIllIllIIIIIllI;
            this.IllIIlllIIIIlllIIlIl = liiIlllIIIllIIIllIII.llIllIlIIIIllIlIIllI().llllIIIIlIIIlIlllIll();
        }
        if (liiiIlIIIIIlllIllIII == 0) {
            this.llllIIIlIlllIlIIIIIl.addAll(liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI());
        }
    }
    
    public IllIlIllIllIlllIIlll(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII, final Collection collection, final int liiiIlIIIIIlllIllIII) {
        this.llllIIIIlIIIlIlllIll = "";
        this.IlIlIlIlIlllllllllIl = "";
        this.llIllIIIIIllIlIIIIlI = "";
        this.IlIIIlIlIIIllIlIlIIl = "";
        this.IlIlIIIllIllIIIIIllI = IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = -1;
        this.llllIIIlIlllIlIIIIIl = Lists.newArrayList();
        if (liiiIlIIIIIlllIllIII != 3 && liiiIlIIIIIlllIllIII != 4) {
            throw new IllegalArgumentException("Method must be join or leave for player constructor");
        }
        if (collection != null && !collection.isEmpty()) {
            this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
            this.llllIIIIlIIIlIlllIll = liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll();
            this.llllIIIlIlllIlIIIIIl.addAll(collection);
            return;
        }
        throw new IllegalArgumentException("Players cannot be null/empty");
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llllIIIIlIIIlIlllIll = llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI(16);
        this.lIIIIlIIIIIlllIllIII = llllllIllIllIlIllllI.readByte();
        if (this.lIIIIlIIIIIlllIllIII == 0 || this.lIIIIlIIIIIlllIllIII == 2) {
            this.IlIlIlIlIlllllllllIl = llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI(32);
            this.llIllIIIIIllIlIIIIlI = llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI(16);
            this.IlIIIlIlIIIllIlIlIIl = llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI(16);
            this.lIIIlllIIIllIIIllIII = llllllIllIllIlIllllI.readByte();
            this.IlIlIIIllIllIIIIIllI = llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI(32);
            this.IllIIlllIIIIlllIIlIl = llllllIllIllIlIllllI.readByte();
        }
        if (this.lIIIIlIIIIIlllIllIII == 0 || this.lIIIIlIIIIIlllIllIII == 3 || this.lIIIIlIIIIIlllIllIII == 4) {
            for (int ilIIIlIlIIIllIlIlIIl = llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl(), i = 0; i < ilIIIlIlIIIllIlIlIIl; ++i) {
                this.llllIIIlIlllIlIIIIIl.add(llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI(40));
            }
        }
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll);
        llllllIllIllIlIllllI.writeByte(this.lIIIIlIIIIIlllIllIII);
        if (this.lIIIIlIIIIIlllIllIII == 0 || this.lIIIIlIIIIIlllIllIII == 2) {
            llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl);
            llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI);
            llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl);
            llllllIllIllIlIllllI.writeByte(this.lIIIlllIIIllIIIllIII);
            llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI);
            llllllIllIllIlIllllI.writeByte(this.IllIIlllIIIIlllIIlIl);
        }
        if (this.lIIIIlIIIIIlllIllIII == 0 || this.lIIIIlIIIIIlllIllIII == 3 || this.lIIIIlIIIIIlllIllIII == 4) {
            llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl(this.llllIIIlIlllIlIIIIIl.size());
            final Iterator<String> iterator = this.llllIIIlIlllIlIIIIIl.iterator();
            while (iterator.hasNext()) {
                llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(iterator.next());
            }
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this);
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public String IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public String llIllIIIIIllIlIIIIlI() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public String IlIIIlIlIIIllIlIlIIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public Collection IlIlIIIllIllIIIIIllI() {
        return this.llllIIIlIlllIlIIIIIl;
    }
    
    public int IllIIlllIIIIlllIIlIl() {
        return this.lIIIIlIIIIIlllIllIII;
    }
    
    public int llllIIIlIlllIlIIIIIl() {
        return this.lIIIlllIIIllIIIllIII;
    }
    
    public int lIIIIlIIIIIlllIllIII() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public String lIIIlllIIIllIIIllIII() {
        return this.IlIlIIIllIllIIIIIllI;
    }
}
