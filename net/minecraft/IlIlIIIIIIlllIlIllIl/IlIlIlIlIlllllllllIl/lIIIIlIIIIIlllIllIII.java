package net.minecraft.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl;

import java.text.*;
import net.minecraft.IlIlIIIIIIlllIlIllIl.*;
import com.mojang.authlib.*;
import com.google.common.base.*;
import com.google.common.io.*;
import java.lang.reflect.*;
import com.google.gson.*;
import org.apache.commons.io.*;
import java.util.*;
import java.io.*;
import com.google.common.collect.*;

public class lIIIIlIIIIIlllIllIII
{
    public static final SimpleDateFormat llllIIIIlIIIlIlllIll;
    private final Map llIllIIIIIllIlIIIIlI;
    private final Map IlIIIlIlIIIllIlIlIIl;
    private final LinkedList IlIlIIIllIllIIIIIllI;
    private final llllIIIIlIIIlIlllIll IllIIlllIIIIlllIIlIl;
    protected final Gson IlIlIlIlIlllllllllIl;
    private final File llllIIIlIlllIlIIIIIl;
    private static final ParameterizedType lIIIIlIIIIIlllIllIII;
    
    static {
        llllIIIIlIIIlIlllIll = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
        lIIIIlIIIIIlllIllIII = new lIIIlllIIIllIIIllIII();
    }
    
    public lIIIIlIIIIIlllIllIII(final llllIIIIlIIIlIlllIll illIIlllIIIIlllIIlIl, final File llllIIIlIlllIlIIIIIl) {
        this.llIllIIIIIllIlIIIIlI = Maps.newHashMap();
        this.IlIIIlIlIIIllIlIlIIl = Maps.newHashMap();
        this.IlIlIIIllIllIIIIIllI = Lists.newLinkedList();
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        final GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeHierarchyAdapter((Class)llIllIlIIIIllIlIIllI.class, (Object)new lIlIlIIIllIIllIIIllI(this, null));
        this.IlIlIlIlIlllllllllIl = gsonBuilder.create();
        this.IlIlIlIlIlllllllllIl();
    }
    
    private static GameProfile llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final String s) {
        final GameProfile[] array = { null };
        final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl = new llIIlIIIlIIIllIlIIIl(array);
        llllIIIIlIIIlIlllIll.IlIllllIIIlIllIlIIll().findProfilesByNames(new String[] { s }, Agent.MINECRAFT, (ProfileLookupCallback)llIIlIIIlIIIllIlIIIl);
        if (!llllIIIIlIIIlIlllIll.lIlIlIlllIIlIlIlllIl() && array[0] == null) {
            ((ProfileLookupCallback)llIIlIIIlIIIllIlIIIl).onProfileLookupSucceeded(new GameProfile(net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new GameProfile((UUID)null, s)), s));
        }
        return array[0];
    }
    
    public void llllIIIIlIIIlIlllIll(final GameProfile gameProfile) {
        this.llllIIIIlIIIlIlllIll(gameProfile, null);
    }
    
    private void llllIIIIlIIIlIlllIll(final GameProfile gameProfile, Date time) {
        final UUID id = gameProfile.getId();
        if (time == null) {
            final Calendar instance = Calendar.getInstance();
            instance.setTime(new Date());
            instance.add(2, 1);
            time = instance.getTime();
        }
        gameProfile.getName().toLowerCase(Locale.ROOT);
        final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI = new llIllIlIIIIllIlIIllI(this, gameProfile, time, null);
        if (this.IlIIIlIlIIIllIlIlIIl.containsKey(id)) {
            this.llIllIIIIIllIlIIIIlI.remove(((llIllIlIIIIllIlIIllI)this.IlIIIlIlIIIllIlIlIIl.get(id)).llllIIIIlIIIlIlllIll().getName().toLowerCase(Locale.ROOT));
            this.IlIlIIIllIllIIIIIllI.remove(gameProfile);
        }
        this.llIllIIIIIllIlIIIIlI.put(gameProfile.getName().toLowerCase(Locale.ROOT), llIllIlIIIIllIlIIllI);
        this.IlIIIlIlIIIllIlIlIIl.put(id, llIllIlIIIIllIlIIllI);
        this.IlIlIIIllIllIIIIIllI.addFirst(gameProfile);
        this.llIllIIIIIllIlIIIIlI();
    }
    
    public GameProfile llllIIIIlIIIlIlllIll(final String s) {
        final String lowerCase = s.toLowerCase(Locale.ROOT);
        llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI = this.llIllIIIIIllIlIIIIlI.get(lowerCase);
        if (llIllIlIIIIllIlIIllI != null && new Date().getTime() >= llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.getTime()) {
            this.IlIIIlIlIIIllIlIlIIl.remove(llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll().getId());
            this.llIllIIIIIllIlIIIIlI.remove(llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll().getName().toLowerCase(Locale.ROOT));
            this.IlIlIIIllIllIIIIIllI.remove(llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll());
            llIllIlIIIIllIlIIllI = null;
        }
        if (llIllIlIIIIllIlIIllI != null) {
            final GameProfile llllIIIIlIIIlIlllIll = llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll();
            this.IlIlIIIllIllIIIIIllI.remove(llllIIIIlIIIlIlllIll);
            this.IlIlIIIllIllIIIIIllI.addFirst(llllIIIIlIIIlIlllIll);
        }
        else {
            final GameProfile llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl, lowerCase);
            if (llllIIIIlIIIlIlllIll2 != null) {
                this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2);
                llIllIlIIIIllIlIIllI = this.llIllIIIIIllIlIIIIlI.get(lowerCase);
            }
        }
        this.llIllIIIIIllIlIIIIlI();
        return (llIllIlIIIIllIlIIllI == null) ? null : llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll();
    }
    
    public String[] llllIIIIlIIIlIlllIll() {
        final ArrayList arrayList = Lists.newArrayList((Iterable)this.llIllIIIIIllIlIIIIlI.keySet());
        return (String[])arrayList.toArray(new String[arrayList.size()]);
    }
    
    public GameProfile llllIIIIlIIIlIlllIll(final UUID uuid) {
        final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI = this.IlIIIlIlIIIllIlIlIIl.get(uuid);
        return (llIllIlIIIIllIlIIllI == null) ? null : llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll();
    }
    
    private llIllIlIIIIllIlIIllI IlIlIlIlIlllllllllIl(final UUID uuid) {
        final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI = this.IlIIIlIlIIIllIlIlIIl.get(uuid);
        if (llIllIlIIIIllIlIIllI != null) {
            final GameProfile llllIIIIlIIIlIlllIll = llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll();
            this.IlIlIIIllIllIIIIIllI.remove(llllIIIIlIIIlIlllIll);
            this.IlIlIIIllIllIIIIIllI.addFirst(llllIIIIlIIIlIlllIll);
        }
        return llIllIlIIIIllIlIIllI;
    }
    
    public void IlIlIlIlIlllllllllIl() {
        Reader reader = null;
        try {
            reader = Files.newReader(this.llllIIIlIlllIlIIIIIl, Charsets.UTF_8);
            final List list = (List)this.IlIlIlIlIlllllllllIl.fromJson(reader, (Type)net.minecraft.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII);
            this.llIllIIIIIllIlIIIIlI.clear();
            this.IlIIIlIlIIIllIlIlIIl.clear();
            this.IlIlIIIllIllIIIIIllI.clear();
            for (final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI : Lists.reverse(list)) {
                if (llIllIlIIIIllIlIIllI != null) {
                    this.llllIIIIlIIIlIlllIll(llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(), llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl());
                }
            }
        }
        catch (FileNotFoundException ex) {}
        catch (JsonParseException ex2) {}
        finally {
            IOUtils.closeQuietly(reader);
        }
        IOUtils.closeQuietly(reader);
    }
    
    public void llIllIIIIIllIlIIIIlI() {
        final String json = this.IlIlIlIlIlllllllllIl.toJson((Object)this.llllIIIIlIIIlIlllIll(1000));
        Writer writer = null;
        try {
            writer = Files.newWriter(this.llllIIIlIlllIlIIIIIl, Charsets.UTF_8);
            writer.write(json);
        }
        catch (FileNotFoundException ex) {}
        catch (IOException ex2) {}
        finally {
            IOUtils.closeQuietly(writer);
        }
    }
    
    private List llllIIIIlIIIlIlllIll(final int n) {
        final ArrayList arrayList = Lists.newArrayList();
        final Iterator<GameProfile> iterator = Lists.newArrayList(Iterators.limit((Iterator)this.IlIlIIIllIllIIIIIllI.iterator(), n)).iterator();
        while (iterator.hasNext()) {
            final llIllIlIIIIllIlIIllI ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl(iterator.next().getId());
            if (ilIlIlIlIlllllllllIl != null) {
                arrayList.add(ilIlIlIlIlllllllllIl);
            }
        }
        return arrayList;
    }
}
