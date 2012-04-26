package net.minecraft.src.ee3.core;

import java.io.File;

import net.minecraft.src.NetworkManager;
import net.minecraft.src.World;

public interface IProxy {
	
	public abstract void registerRenderInformation();
	
	public abstract void registerTileEntities();
	
	public abstract void registerTranslations();
	
	public abstract File getMinecraftDir();
	
	public abstract boolean isRemote();
	
	public abstract World getCurrentWorld();
	
	public abstract String getMinecraftVersion();
	
	public abstract void handleControl(NetworkManager network, int key);
	
	public abstract void handlePedestalPacket(int x, int y, int z, int itemId, boolean activated);
	
	public abstract void handleTEPacket(int x, int y, int z, byte direction, String player);
}