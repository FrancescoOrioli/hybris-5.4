/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 2-mag-2017 15.56.21                         ---
 * ----------------------------------------------------------------
 *  
 * [y] hybris Platform
 *  
 * Copyright (c) 2000-2011 hybris AG
 * All rights reserved.
 *  
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *  
 */
package de.hybris.platform.recipes.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.product.Unit;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.recipes.constants.RecipesConstants;
import de.hybris.platform.recipes.jalo.Food;
import de.hybris.platform.recipes.jalo.Recipe;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem RecipeEntry}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedRecipeEntry extends GenericItem
{
	/** Qualifier of the <code>RecipeEntry.prodotto</code> attribute **/
	public static final String PRODOTTO = "prodotto";
	/** Qualifier of the <code>RecipeEntry.quantity</code> attribute **/
	public static final String QUANTITY = "quantity";
	/** Qualifier of the <code>RecipeEntry.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>RecipeEntry.unity</code> attribute **/
	public static final String UNITY = "unity";
	/** Qualifier of the <code>RecipeEntry.recipe</code> attribute **/
	public static final String RECIPE = "recipe";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n RECIPE's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedRecipeEntry> RECIPEHANDLER = new BidirectionalOneToManyHandler<GeneratedRecipeEntry>(
	RecipesConstants.TC.RECIPEENTRY,
	false,
	"recipe",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(PRODOTTO, AttributeMode.INITIAL);
		tmp.put(QUANTITY, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(UNITY, AttributeMode.INITIAL);
		tmp.put(RECIPE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		RECIPEHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RecipeEntry.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedRecipeEntry.getName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RecipeEntry.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RecipeEntry.name</code> attribute. 
	 * @return the localized name
	 */
	public Map<Language,String> getAllName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,NAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RecipeEntry.name</code> attribute. 
	 * @return the localized name
	 */
	public Map<Language,String> getAllName()
	{
		return getAllName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RecipeEntry.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedRecipeEntry.setName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RecipeEntry.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RecipeEntry.name</code> attribute. 
	 * @param value the name
	 */
	public void setAllName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RecipeEntry.name</code> attribute. 
	 * @param value the name
	 */
	public void setAllName(final Map<Language,String> value)
	{
		setAllName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RecipeEntry.prodotto</code> attribute.
	 * @return the prodotto
	 */
	public Food getProdotto(final SessionContext ctx)
	{
		return (Food)getProperty( ctx, PRODOTTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RecipeEntry.prodotto</code> attribute.
	 * @return the prodotto
	 */
	public Food getProdotto()
	{
		return getProdotto( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RecipeEntry.prodotto</code> attribute. 
	 * @param value the prodotto
	 */
	public void setProdotto(final SessionContext ctx, final Food value)
	{
		setProperty(ctx, PRODOTTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RecipeEntry.prodotto</code> attribute. 
	 * @param value the prodotto
	 */
	public void setProdotto(final Food value)
	{
		setProdotto( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RecipeEntry.quantity</code> attribute.
	 * @return the quantity
	 */
	public Integer getQuantity(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, QUANTITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RecipeEntry.quantity</code> attribute.
	 * @return the quantity
	 */
	public Integer getQuantity()
	{
		return getQuantity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RecipeEntry.quantity</code> attribute. 
	 * @return the quantity
	 */
	public int getQuantityAsPrimitive(final SessionContext ctx)
	{
		Integer value = getQuantity( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RecipeEntry.quantity</code> attribute. 
	 * @return the quantity
	 */
	public int getQuantityAsPrimitive()
	{
		return getQuantityAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RecipeEntry.quantity</code> attribute. 
	 * @param value the quantity
	 */
	public void setQuantity(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, QUANTITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RecipeEntry.quantity</code> attribute. 
	 * @param value the quantity
	 */
	public void setQuantity(final Integer value)
	{
		setQuantity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RecipeEntry.quantity</code> attribute. 
	 * @param value the quantity
	 */
	public void setQuantity(final SessionContext ctx, final int value)
	{
		setQuantity( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RecipeEntry.quantity</code> attribute. 
	 * @param value the quantity
	 */
	public void setQuantity(final int value)
	{
		setQuantity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RecipeEntry.recipe</code> attribute.
	 * @return the recipe
	 */
	public Recipe getRecipe(final SessionContext ctx)
	{
		return (Recipe)getProperty( ctx, RECIPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RecipeEntry.recipe</code> attribute.
	 * @return the recipe
	 */
	public Recipe getRecipe()
	{
		return getRecipe( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RecipeEntry.recipe</code> attribute. 
	 * @param value the recipe
	 */
	public void setRecipe(final SessionContext ctx, final Recipe value)
	{
		RECIPEHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RecipeEntry.recipe</code> attribute. 
	 * @param value the recipe
	 */
	public void setRecipe(final Recipe value)
	{
		setRecipe( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RecipeEntry.unity</code> attribute.
	 * @return the unity
	 */
	public Unit getUnity(final SessionContext ctx)
	{
		return (Unit)getProperty( ctx, UNITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RecipeEntry.unity</code> attribute.
	 * @return the unity
	 */
	public Unit getUnity()
	{
		return getUnity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RecipeEntry.unity</code> attribute. 
	 * @param value the unity
	 */
	public void setUnity(final SessionContext ctx, final Unit value)
	{
		setProperty(ctx, UNITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RecipeEntry.unity</code> attribute. 
	 * @param value the unity
	 */
	public void setUnity(final Unit value)
	{
		setUnity( getSession().getSessionContext(), value );
	}
	
}
