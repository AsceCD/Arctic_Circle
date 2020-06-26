package SlightStank.ArcticCircle.lists;

import SlightStank.ArcticCircle.ArcticCircle;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public enum ArmorMaterialList implements IArmorMaterial {
	
	cold_steel_material("coldsteel", 400, new int[] {8,10,9,7}, 25, ItemList.cold_steel, "entity.ender_dragon.growl", 0.0f);

	private static final int[] MAX_DAMAGE_ARRAY= new int[] {13,15,16,11};
	private String name, equipSound;
	private int durability, enchantability;
	private int[] damageReductionAmount;
	private Item repairItem;
	private float toughness;
	
	private ArmorMaterialList(String name, int durability, int[] damageReductionAmount, int enchantability, Item repairItem, String equipSound, float toughness) {
		this.name = name;
		this.durability = durability;
		this.damageReductionAmount = damageReductionAmount;
		this.enchantability = enchantability;
		this.repairItem = repairItem;
		this.equipSound = equipSound;
		this.toughness = toughness;
	}
	
	@Override
	public int getDurability(EquipmentSlotType slotIn) {
		return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.durability;
	}

	@Override
	public int getDamageReductionAmount(EquipmentSlotType slotIn) {
		return this.damageReductionAmount[slotIn.getIndex()];
	}

	@Override
	public int getEnchantability() {
		return this.enchantability;
	}

	@Override
	public SoundEvent getSoundEvent() {
		return new SoundEvent(new ResourceLocation(equipSound));
	}

	@Override
	public Ingredient getRepairMaterial() {
		return Ingredient.fromItems(this.repairItem);
	}

	@Override
	public String getName() {
		return ArcticCircle.MOD_ID + ":" + this.name;
	}

	@Override
	public float getToughness() {
		return this.toughness;
	}

}
