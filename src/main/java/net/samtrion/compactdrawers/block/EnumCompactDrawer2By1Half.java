package net.samtrion.compactdrawers.block;

import com.jaquadro.minecraft.storagedrawers.api.storage.IDrawerGeometry;

public enum EnumCompactDrawer2By1Half implements IDrawerGeometry, IDrawerSerializable {
	OPEN1(0, 2, "open1"), OPEN2(1, 1, "open2");

	private static final EnumCompactDrawer2By1Half[] META_LOOKUP;

	private final int meta;
	private final int openSlots;
	private final String name;

	EnumCompactDrawer2By1Half(int meta, int openSlots, String name) {
		this.meta = meta;
		this.name = name;
		this.openSlots = openSlots;
	}

	static {
		META_LOOKUP = new EnumCompactDrawer2By1Half[values().length];
		for (EnumCompactDrawer2By1Half type : values()) {
			META_LOOKUP[type.getMetadata()] = type;
		}
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getDrawerCount() {
		return 2;
	}

	@Override
	public boolean isHalfDepth() {
		return true;
	}

	@Override
	public int getMetadata() {
		return meta;
	}

	public int getOpenSlots() {
		return openSlots;
	}

}
