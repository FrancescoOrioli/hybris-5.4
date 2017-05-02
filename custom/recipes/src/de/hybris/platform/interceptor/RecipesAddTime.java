/**
 *
 */
package de.hybris.platform.interceptor;

import de.hybris.platform.recipes.model.RecipeModel;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;


/**
 * @author soprasteria
 *
 */

public class RecipesAddTime implements PrepareInterceptor<RecipeModel>
{

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.servicelayer.interceptor.PrepareInterceptor#onPrepare(java.lang.Object,
	 * de.hybris.platform.servicelayer.interceptor.InterceptorContext)
	 */
	@Override
	public void onPrepare(final RecipeModel arg0, final InterceptorContext arg1) throws InterceptorException
	{
		// YTODO Auto-generated method stub
		final Integer tempo = arg0.getTempo();
		final int aggiungi = tempo.intValue() + 10;
		arg0.setTempo(Integer.valueOf(aggiungi));

	}

}
