package net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl;

import org.apache.logging.log4j.*;
import net.minecraft.IlIlIIIIIIlllIlIllIl.*;
import java.io.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;

public class lIlIlIIIllIIllIIIllI implements IlIIIlIlIIIllIlIlIIl, IlIlIlIlIlllllllllIl
{
    private static final Logger llllIIIIlIIIlIlllIll;
    private final File IlIlIlIlIlllllllllIl;
    private final File llIllIIIIIllIlIIIIlI;
    private final File IlIIIlIlIIIllIlIlIIl;
    private final long IlIlIIIllIllIIIIIllI;
    private final String IllIIlllIIIIlllIIlIl;
    
    static {
        llllIIIIlIIIlIlllIll = LogManager.getLogger();
    }
    
    public lIlIlIIIllIIllIIIllI(final File file, final String illIIlllIIIIlllIIlIl, final boolean b) {
        this.IlIlIIIllIllIIIIIllI = net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.lllllIIllIlIllIllllI();
        (this.IlIlIlIlIlllllllllIl = new File(file, illIIlllIIIIlllIIlIl)).mkdirs();
        this.llIllIIIIIllIlIIIIlI = new File(this.IlIlIlIlIlllllllllIl, "playerdata");
        (this.IlIIIlIlIIIllIlIlIIl = new File(this.IlIlIlIlIlllllllllIl, "data")).mkdirs();
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        if (b) {
            this.llIllIIIIIllIlIIIIlI.mkdirs();
        }
        this.lIIIIlIIIIIlllIllIII();
    }
    
    private void lIIIIlIIIIIlllIllIII() {
        try {
            final DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(this.IlIlIlIlIlllllllllIl, "session.lock")));
            try {
                dataOutputStream.writeLong(this.IlIlIIIllIllIIIIIllI);
            }
            finally {
                dataOutputStream.close();
            }
            dataOutputStream.close();
        }
        catch (IOException ex) {
            ex.printStackTrace();
            throw new RuntimeException("Failed to check session lock, aborting");
        }
    }
    
    @Override
    public File IllIIlllIIIIlllIIlIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        try {
            final DataInputStream dataInputStream = new DataInputStream(new FileInputStream(new File(this.IlIlIlIlIlllllllllIl, "session.lock")));
            try {
                if (dataInputStream.readLong() != this.IlIlIIIllIllIIIIIllI) {
                    throw new lllIIIIlllllIlIIllIl("The save is being accessed from another location, aborting");
                }
            }
            finally {
                dataInputStream.close();
            }
            dataInputStream.close();
        }
        catch (IOException ex) {
            throw new lllIIIIlllllIlIIllIl("Failed to check session lock, aborting");
        }
    }
    
    @Override
    public lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll(final lllllIlIIIlIlIIlllII lllllIlIIIlIlIIlllII) {
        throw new RuntimeException("Old Chunk Storage is no longer supported.");
    }
    
    @Override
    public llllIIllllIlIlIIIIll llIllIIIIIllIlIIIIlI() {
        final File file = new File(this.IlIlIlIlIlllllllllIl, "level.dat");
        if (file.exists()) {
            try {
                return new llllIIllllIlIlIIIIll(net.minecraft.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new FileInputStream(file)).IlIlIIIllIIllIlllllI("Data"));
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        final File file2 = new File(this.IlIlIlIlIlllllllllIl, "level.dat_old");
        if (file2.exists()) {
            try {
                return new llllIIllllIlIlIIIIll(net.minecraft.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new FileInputStream(file2)).IlIlIIIllIIllIlllllI("Data"));
            }
            catch (Exception ex2) {
                ex2.printStackTrace();
            }
        }
        return null;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll, final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        final IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll = llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll2 = new IIIIlllIIIIIIlIIIlll();
        iiiIlllIIIIIIlIIIlll2.llllIIIIlIIIlIlllIll("Data", llllIIIIlIIIlIlllIll);
        try {
            final File file = new File(this.IlIlIlIlIlllllllllIl, "level.dat_new");
            final File file2 = new File(this.IlIlIlIlIlllllllllIl, "level.dat_old");
            final File file3 = new File(this.IlIlIlIlIlllllllllIl, "level.dat");
            net.minecraft.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll2, new FileOutputStream(file));
            if (file2.exists()) {
                file2.delete();
            }
            file3.renameTo(file2);
            if (file3.exists()) {
                file3.delete();
            }
            file.renameTo(file3);
            if (file.exists()) {
                file.delete();
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll) {
        final IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll = llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll();
        final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = new IIIIlllIIIIIIlIIIlll();
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Data", llllIIIIlIIIlIlllIll);
        try {
            final File file = new File(this.IlIlIlIlIlllllllllIl, "level.dat_new");
            final File file2 = new File(this.IlIlIlIlIlllllllllIl, "level.dat_old");
            final File file3 = new File(this.IlIlIlIlIlllllllllIl, "level.dat");
            net.minecraft.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll, new FileOutputStream(file));
            if (file2.exists()) {
                file2.delete();
            }
            file3.renameTo(file2);
            if (file3.exists()) {
                file3.delete();
            }
            file.renameTo(file3);
            if (file.exists()) {
                file.delete();
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        try {
            final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = new IIIIlllIIIIIIlIIIlll();
            llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(iiiIlllIIIIIIlIIIlll);
            final File file = new File(this.llIllIIIIIllIlIIIIlI, String.valueOf(llllIIIIlIIIlIlllIll.lllIIIIlIlIllIIlIIIl().toString()) + ".dat.tmp");
            final File file2 = new File(this.llIllIIIIIllIlIIIIlI, String.valueOf(llllIIIIlIIIlIlllIll.lllIIIIlIlIllIIlIIIl().toString()) + ".dat");
            net.minecraft.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll, new FileOutputStream(file));
            if (file2.exists()) {
                file2.delete();
            }
            file.renameTo(file2);
        }
        catch (Exception ex) {
            lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll.warn("Failed to save player data for " + llllIIIIlIIIlIlllIll.s_());
        }
    }
    
    @Override
    public IIIIlllIIIIIIlIIIlll IlIlIlIlIlllllllllIl(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll2 = null;
        try {
            final File file = new File(this.llIllIIIIIllIlIIIIlI, String.valueOf(llllIIIIlIIIlIlllIll.lllIIIIlIlIllIIlIIIl().toString()) + ".dat");
            if (file.exists() && file.isFile()) {
                llllIIIIlIIIlIlllIll2 = net.minecraft.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new FileInputStream(file));
            }
        }
        catch (Exception ex) {
            lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll.warn("Failed to load player data for " + llllIIIIlIIIlIlllIll.s_());
        }
        if (llllIIIIlIIIlIlllIll2 != null) {
            llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl(llllIIIIlIIIlIlllIll2);
        }
        return llllIIIIlIIIlIlllIll2;
    }
    
    @Override
    public IlIlIlIlIlllllllllIl IlIlIIIllIllIIIIIllI() {
        return this;
    }
    
    @Override
    public String[] IlIlIlIlIlllllllllIl() {
        String[] list = this.llIllIIIIIllIlIIIIlI.list();
        if (list == null) {
            list = new String[0];
        }
        for (int i = 0; i < list.length; ++i) {
            if (list[i].endsWith(".dat")) {
                list[i] = list[i].substring(0, list[i].length() - 4);
            }
        }
        return list;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll() {
    }
    
    @Override
    public File llllIIIIlIIIlIlllIll(final String s) {
        return new File(this.IlIIIlIlIIIllIlIlIIl, String.valueOf(s) + ".dat");
    }
    
    @Override
    public String llllIIIlIlllIlIIIIIl() {
        return this.IllIIlllIIIIlllIIlIl;
    }
}
