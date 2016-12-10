package com.pahimar.letsmodreboot.block;

import com.pahimar.letsmodreboot.reference.Names;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockPyramid extends BlockLMRB
{
    public BlockPyramid()
    {
        super(Material.rock);
        this.setBlockName(Names.Blocks.PYRAMID);
        this.setBlockTextureName("sandstone");
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        this.blockIcon = iconRegister.registerIcon("tile.sandStone");
    }
}
