package net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl;

import org.apache.logging.log4j.*;
import com.google.common.collect.*;
import java.util.*;
import java.io.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class llIllIlIIIIllIlIIllI implements llIllIIIIIllIlIIIIlI
{
    private static final Logger IlIlIlIlIlllllllllIl;
    protected final File llllIIIIlIIIlIlllIll;
    
    static {
        IlIlIlIlIlllllllllIl = LogManager.getLogger();
    }
    
    public llIllIlIIIIllIlIIllI(final File llllIIIIlIIIlIlllIll) {
        if (!llllIIIIlIIIlIlllIll.exists()) {
            llllIIIIlIIIlIlllIll.mkdirs();
        }
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public String llllIIIIlIIIlIlllIll() {
        return "Old Format";
    }
    
    @Override
    public List IlIlIlIlIlllllllllIl() {
        final ArrayList arrayList = Lists.newArrayList();
        for (int i = 0; i < 5; ++i) {
            final String string = "World" + (i + 1);
            final llllIIllllIlIlIIIIll llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI(string);
            if (llIllIIIIIllIlIIIIlI != null) {
                arrayList.add(new llIIlIIIlIIIllIlIIIl(string, "", llIllIIIIIllIlIIIIlI.lIlIlIIIllIIllIIIllI(), llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII(), llIllIIIIIllIlIIIIlI.IIlllIIlIllIllIlIIll(), false, llIllIIIIIllIlIIIIlI.IlIlIIIIIIlllIlIllIl(), llIllIIIIIllIlIIIIlI.IIIlIIIlIlIIlllIIlll()));
            }
        }
        return arrayList;
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
    }
    
    @Override
    public llllIIllllIlIlIIIIll llIllIIIIIllIlIIIIlI(final String s) {
        final File file = new File(this.llllIIIIlIIIlIlllIll, s);
        if (!file.exists()) {
            return null;
        }
        final File file2 = new File(file, "level.dat");
        if (file2.exists()) {
            try {
                return new llllIIllllIlIlIIIIll(net.minecraft.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new FileInputStream(file2)).IlIlIIIllIIllIlllllI("Data"));
            }
            catch (Exception ex) {
                llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.error("Exception reading " + file2, (Throwable)ex);
            }
        }
        final File file3 = new File(file, "level.dat_old");
        if (file3.exists()) {
            try {
                return new llllIIllllIlIlIIIIll(net.minecraft.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new FileInputStream(file3)).IlIlIIIllIIllIlllllI("Data"));
            }
            catch (Exception ex2) {
                llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.error("Exception reading " + file3, (Throwable)ex2);
            }
        }
        return null;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final String s, final String s2) {
        final File file = new File(this.llllIIIIlIIIlIlllIll, s);
        if (file.exists()) {
            final File file2 = new File(file, "level.dat");
            if (file2.exists()) {
                try {
                    final IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll = net.minecraft.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new FileInputStream(file2));
                    llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI("Data").llllIIIIlIIIlIlllIll("LevelName", s2);
                    net.minecraft.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, new FileOutputStream(file2));
                }
                catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl(final String s) {
        final File file = new File(this.llllIIIIlIIIlIlllIll, s);
        if (file.exists()) {
            return false;
        }
        try {
            file.mkdir();
            file.delete();
            return true;
        }
        catch (Throwable t) {
            llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.warn("Couldn't make new level", t);
            return false;
        }
    }
    
    @Override
    public boolean IlIlIIIllIllIIIIIllI(final String s) {
        final File file = new File(this.llllIIIIlIIIlIlllIll, s);
        if (!file.exists()) {
            return true;
        }
        llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.info("Deleting level " + s);
        for (int i = 1; i <= 5; ++i) {
            llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.info("Attempt " + i + "...");
            if (llllIIIIlIIIlIlllIll(file.listFiles())) {
                break;
            }
            llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.warn("Unsuccessful in deleting contents.");
            if (i < 5) {
                try {
                    Thread.sleep(500L);
                }
                catch (InterruptedException ex) {}
            }
        }
        return file.delete();
    }
    
    protected static boolean llllIIIIlIIIlIlllIll(final File[] array) {
        for (int i = 0; i < array.length; ++i) {
            final File file = array[i];
            llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.debug("Deleting " + file);
            if (file.isDirectory() && !llllIIIIlIIIlIlllIll(file.listFiles())) {
                llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.warn("Couldn't delete directory " + file);
                return false;
            }
            if (!file.delete()) {
                llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.warn("Couldn't delete file " + file);
                return false;
            }
        }
        return true;
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final String s, final boolean b) {
        return new lIlIlIIIllIIllIIIllI(this.llllIIIIlIIIlIlllIll, s, b);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final String s) {
        return false;
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl(final String s) {
        return false;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final String s, final lllllIIIIIlIlIIIIIIl lllllIIIIIlIlIIIIIIl) {
        return false;
    }
    
    @Override
    public boolean IllIIlllIIIIlllIIlIl(final String s) {
        return new File(this.llllIIIIlIIIlIlllIll, s).isDirectory();
    }
}
