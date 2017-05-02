/**
 *
 */
package de.hybris.platform.recipes.handlers;

import de.hybris.platform.recipes.model.RecipeModel;
import de.hybris.platform.servicelayer.model.attribute.DynamicAttributeHandler;

import org.apache.commons.collections.CollectionUtils;


/**
 * @author soprasteria
 *
 */
public class NumberOfIngredientsAttributeHandler implements DynamicAttributeHandler<Integer, RecipeModel>
{

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * de.hybris.platform.servicelayer.model.attribute.DynamicAttributeHandler#get(de.hybris.platform.servicelayer.model.
	 * AbstractItemModel)
	 */
	@Override
	public Integer get(final RecipeModel arg0)
	{
		if (arg0 != null && CollectionUtils.isNotEmpty(arg0.getRecipeEntry()))
		{
			return Integer.valueOf(arg0.getRecipeEntry().size());
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * de.hybris.platform.servicelayer.model.attribute.DynamicAttributeHandler#set(de.hybris.platform.servicelayer.model.
	 * AbstractItemModel, java.lang.Object)
	 */
	@Override
	public void set(final RecipeModel arg0, final Integer arg1)
	{
		// YTODO Auto-generated method stub

	}

}
