package net.minecraft.client.llIIlIIIlIIIllIlIIIl;

import net.minecraft.client.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll.*;
import java.util.concurrent.locks.*;
import org.apache.logging.log4j.*;
import net.minecraft.client.llIllIlIIIIllIlIIllI.*;
import com.google.common.collect.*;
import com.google.common.hash.*;
import com.google.common.io.*;
import org.apache.commons.io.*;
import java.io.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.client.*;
import java.util.concurrent.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import com.google.common.util.concurrent.*;
import org.apache.commons.io.filefilter.*;
import org.apache.commons.io.comparator.*;
import java.util.*;

public class IIIlIIlIIIIlllIlllII
{
    private static final Logger IlIIIlIlIIIllIlIlIIl;
    private static final FileFilter IlIlIIIllIllIIIIIllI;
    private final File IllIIlllIIIIlllIIlIl;
    public final llllIIllllIlIlIIIIll llllIIIIlIIIlIlllIll;
    private final File llllIIIlIlllIlIIIIIl;
    public final lIIIlllIIIllIIIllIII IlIlIlIlIlllllllllIl;
    private llllIIllllIlIlIIIIll lIIIIlIIIIIlllIllIII;
    private final ReentrantLock lIIIlllIIIllIIIllIII;
    private ListenableFuture llIIlIIIlIIIllIlIIIl;
    private List llIllIlIIIIllIlIIllI;
    public List llIllIIIIIllIlIIIIlI;
    
    static {
        IlIIIlIlIIIllIlIlIIl = LogManager.getLogger();
        IlIlIIIllIllIIIIIllI = new IlIlIllllllllIIIIlII();
    }
    
    public IIIlIIlIIIIlllIlllII(final File illIIlllIIIIlllIIlIl, final File llllIIIlIlllIlIIIIIl, final llllIIllllIlIlIIIIll llllIIIIlIIIlIlllIll, final lIIIlllIIIllIIIllIII ilIlIlIlIlllllllllIl, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2) {
        this.lIIIlllIIIllIIIllIII = new ReentrantLock();
        this.llIllIlIIIIllIlIIllI = Lists.newArrayList();
        this.llIllIIIIIllIlIIIIlI = Lists.newArrayList();
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llllIIIlIlllIlIIIIIl();
        this.llllIIIIlIIIlIlllIll();
        final Iterator iterator = llllIIIIlIIIlIlllIll2.llIllIlIIIIllIlIIllI.iterator();
        while (iterator.hasNext()) {
            final String s = iterator.next();
            for (final lllllIlIIIlIlIIlllII lllllIlIIIlIlIIlllII : this.llIllIlIIIIllIlIIllI) {
                if (lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl().equals(s)) {
                    if (lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl() == 1 || llllIIIIlIIIlIlllIll2.lIlIlIIIllIIllIIIllI.contains(lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl())) {
                        this.llIllIIIIIllIlIIIIlI.add(lllllIlIIIlIlIIlllII);
                        break;
                    }
                    iterator.remove();
                    IIIlIIlIIIIlllIlllII.IlIIIlIlIIIllIlIlIIl.warn("Removed selected resource pack {} because it's no longer compatible", new Object[] { lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl() });
                }
            }
        }
    }
    
    private void llllIIIlIlllIlIIIIIl() {
        if (this.IllIIlllIIIIlllIIlIl.exists()) {
            if (!this.IllIIlllIIIIlllIIlIl.isDirectory() && (!this.IllIIlllIIIIlllIIlIl.delete() || !this.IllIIlllIIIIlllIIlIl.mkdirs())) {
                IIIlIIlIIIIlllIlllII.IlIIIlIlIIIllIlIlIIl.warn("Unable to recreate resourcepack folder, it exists but is not a directory: " + this.IllIIlllIIIIlllIIlIl);
            }
        }
        else if (!this.IllIIlllIIIIlllIIlIl.mkdirs()) {
            IIIlIIlIIIIlllIlllII.IlIIIlIlIIIllIlIlIIl.warn("Unable to create resourcepack folder: " + this.IllIIlllIIIIlllIIlIl);
        }
    }
    
    private List lIIIIlIIIIIlllIllIII() {
        return this.IllIIlllIIIIlllIIlIl.isDirectory() ? Arrays.asList(this.IllIIlllIIIIlllIIlIl.listFiles(IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI)) : Collections.emptyList();
    }
    
    public void llllIIIIlIIIlIlllIll() {
        final ArrayList arrayList = Lists.newArrayList();
        final Iterator<File> iterator = this.lIIIIlIIIIIlllIllIII().iterator();
        while (iterator.hasNext()) {
            final lllllIlIIIlIlIIlllII lllllIlIIIlIlIIlllII = new lllllIlIIIlIlIIlllII(this, iterator.next(), null);
            if (!this.llIllIlIIIIllIlIIllI.contains(lllllIlIIIlIlIIlllII)) {
                try {
                    lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll();
                    arrayList.add(lllllIlIIIlIlIIlllII);
                }
                catch (Exception ex) {
                    arrayList.remove(lllllIlIIIlIlIIlllII);
                }
            }
            else {
                final int index = this.llIllIlIIIIllIlIIllI.indexOf(lllllIlIIIlIlIIlllII);
                if (index <= -1 || index >= this.llIllIlIIIIllIlIIllI.size()) {
                    continue;
                }
                arrayList.add(this.llIllIlIIIIllIlIIllI.get(index));
            }
        }
        this.llIllIlIIIIllIlIIllI.removeAll(arrayList);
        final Iterator<lllllIlIIIlIlIIlllII> iterator2 = this.llIllIlIIIIllIlIIllI.iterator();
        while (iterator2.hasNext()) {
            iterator2.next().IlIlIlIlIlllllllllIl();
        }
        this.llIllIlIIIIllIlIIllI = arrayList;
    }
    
    public List IlIlIlIlIlllllllllIl() {
        return (List)ImmutableList.copyOf((Collection)this.llIllIlIIIIllIlIIllI);
    }
    
    public List llIllIIIIIllIlIIIIlI() {
        return (List)ImmutableList.copyOf((Collection)this.llIllIIIIIllIlIIIIlI);
    }
    
    public void llllIIIIlIIIlIlllIll(final List list) {
        this.llIllIIIIIllIlIIIIlI.clear();
        this.llIllIIIIIllIlIIIIlI.addAll(list);
    }
    
    public File IlIIIlIlIIIllIlIlIIl() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public ListenableFuture llllIIIIlIIIlIlllIll(final String s, final String s2) {
        String s3;
        if (s2.matches("^[a-f0-9]{40}$")) {
            s3 = s2;
        }
        else {
            s3 = "legacy";
        }
        final File file = new File(this.llllIIIlIlllIlIIIIIl, s3);
        this.lIIIlllIIIllIIIllIII.lock();
        try {
            this.IllIIlllIIIIlllIIlIl();
            if (file.exists() && s2.length() == 40) {
                try {
                    final String string = Hashing.sha1().hashBytes(Files.toByteArray(file)).toString();
                    if (string.equals(s2)) {
                        return this.llllIIIIlIIIlIlllIll(file);
                    }
                    IIIlIIlIIIIlllIlllII.IlIIIlIlIIIllIlIlIIl.warn("File " + file + " had wrong hash (expected " + s2 + ", found " + string + "). Deleting it.");
                    FileUtils.deleteQuietly(file);
                }
                catch (IOException ex) {
                    IIIlIIlIIIIlllIlllII.IlIIIlIlIIIllIlIlIIl.warn("File " + file + " couldn't be hashed. Deleting it.", (Throwable)ex);
                    FileUtils.deleteQuietly(file);
                }
            }
            this.lIIIlllIIIllIIIllIII();
            final llIlllIlllllIIllIIII llIlllIlllllIIllIIII = new llIlllIlllllIIllIIII();
            final Map iiIllIIIlIlIIllIIIlI = Minecraft.IIIllIIIlIlIIllIIIlI();
            final Minecraft minecraft = Minecraft.getMinecraft();
            Futures.getUnchecked((Future)minecraft.llllIIIIlIIIlIlllIll(new IIlllIlIIllIlIlIlIIl(this, minecraft, llIlllIlllllIIllIIII)));
            Futures.addCallback(this.llIIlIIIlIIIllIlIIIl = IIlIIIlllIllIllIlIII.llllIIIIlIIIlIlllIll(file, s, iiIllIIIlIlIIllIIIlI, 52428800, llIlllIlllllIIllIIII, minecraft.IlllIIIIlIIIlIlIlIIl()), (FutureCallback)new llIIIlIlIllIIlIlIlII(this, file, SettableFuture.create()));
            return this.llIIlIIIlIIIllIlIIIl;
        }
        finally {
            this.lIIIlllIIIllIIIllIII.unlock();
        }
    }
    
    private void lIIIlllIIIllIIIllIII() {
        final ArrayList arrayList = Lists.newArrayList((Iterable)FileUtils.listFiles(this.llllIIIlIlllIlIIIIIl, TrueFileFilter.TRUE, (IOFileFilter)null));
        Collections.sort((List<Object>)arrayList, LastModifiedFileComparator.LASTMODIFIED_REVERSE);
        int n = 0;
        for (final File file : arrayList) {
            if (n++ >= 10) {
                IIIlIIlIIIIlllIlllII.IlIIIlIlIIIllIlIlIIl.info("Deleting old server resource pack " + file.getName());
                FileUtils.deleteQuietly(file);
            }
        }
    }
    
    public ListenableFuture llllIIIIlIIIlIlllIll(final File file) {
        this.lIIIIlIIIIIlllIllIII = new IllIIlllIIIIlllIIlIl(file);
        return Minecraft.getMinecraft().IlIlIllllllllIIIIlII();
    }
    
    public llllIIllllIlIlIIIIll IlIlIIIllIllIIIIIllI() {
        return this.lIIIIlIIIIIlllIllIII;
    }
    
    public void IllIIlllIIIIlllIIlIl() {
        this.lIIIlllIIIllIIIllIII.lock();
        try {
            if (this.llIIlIIIlIIIllIlIIIl != null) {
                this.llIIlIIIlIIIllIlIIIl.cancel(true);
            }
            this.llIIlIIIlIIIllIlIIIl = null;
            if (this.lIIIIlIIIIIlllIllIII != null) {
                this.lIIIIlIIIIIlllIllIII = null;
                Minecraft.getMinecraft().IlIlIllllllllIIIIlII();
            }
        }
        finally {
            this.lIIIlllIIIllIIIllIII.unlock();
        }
        this.lIIIlllIIIllIIIllIII.unlock();
    }
}
