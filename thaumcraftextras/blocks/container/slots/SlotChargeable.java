package thaumcraftextras.blocks.container.slots;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import thaumcraftextras.blocks.tileEntity.TileEntityExchanger;

public class SlotChargeable extends Slot {

        TileEntityExchanger tile;

        public SlotChargeable(TileEntityExchanger tileI, int x, int y, int z) {
                super(tileI, x, y, z);
                this.tile = tileI;
        }

        @Override
        public boolean isItemValid(ItemStack par1ItemStack) {
        	return true;
        }

        @Override
        public int getSlotStackLimit() {
                return 1;
        }

        @Override
        public boolean canTakeStack(EntityPlayer par1EntityPlayer) {
        	return false;
        }
}