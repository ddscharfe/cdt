/**********************************************************************
 * Copyright (c) 2002,2003 Rational Software Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v0.5
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v05.html
 * 
 * Contributors: 
 * IBM Rational Software - Initial API and implementation
***********************************************************************/
package org.eclipse.cdt.internal.core.parser.ast.complete;

import org.eclipse.cdt.core.parser.ISourceElementRequestor;
import org.eclipse.cdt.core.parser.ast.IASTAbstractDeclaration;
import org.eclipse.cdt.core.parser.ast.IASTScope;
import org.eclipse.cdt.core.parser.ast.IASTTypedefDeclaration;

/**
 * @author jcamelon
 *
 */
public class ASTTypedef implements IASTTypedefDeclaration
{
    /**
     * 
     */
    public ASTTypedef()
    {
        super();
        // TODO Auto-generated constructor stub
    }
    /* (non-Javadoc)
     * @see org.eclipse.cdt.core.parser.ast.IASTOffsetableNamedElement#getName()
     */
    public String getName()
    {
        // TODO Auto-generated method stub
        return null;
    }
    /* (non-Javadoc)
     * @see org.eclipse.cdt.core.parser.ast.IASTTypedefDeclaration#getAbstractDeclarator()
     */
    public IASTAbstractDeclaration getAbstractDeclarator()
    {
        // TODO Auto-generated method stub
        return null;
    }
    /* (non-Javadoc)
     * @see org.eclipse.cdt.core.parser.ast.IASTOffsetableNamedElement#getNameOffset()
     */
    public int getNameOffset()
    {
        // TODO Auto-generated method stub
        return 0;
    }
    /* (non-Javadoc)
     * @see org.eclipse.cdt.core.parser.ast.IASTOffsetableNamedElement#setNameOffset(int)
     */
    public void setNameOffset(int o)
    {
        // TODO Auto-generated method stub
    }
    /* (non-Javadoc)
     * @see org.eclipse.cdt.core.parser.ast.IASTQualifiedNameElement#getFullyQualifiedName()
     */
    public String[] getFullyQualifiedName()
    {
        // TODO Auto-generated method stub
        return null;
    }
    /* (non-Javadoc)
     * @see org.eclipse.cdt.core.parser.ast.IASTScopedElement#getOwnerScope()
     */
    public IASTScope getOwnerScope()
    {
        // TODO Auto-generated method stub
        return null;
    }
    /* (non-Javadoc)
     * @see org.eclipse.cdt.core.parser.ISourceElementCallbackDelegate#acceptElement(org.eclipse.cdt.core.parser.ISourceElementRequestor)
     */
    public void acceptElement(ISourceElementRequestor requestor)
    {
        // TODO Auto-generated method stub
    }
    /* (non-Javadoc)
     * @see org.eclipse.cdt.core.parser.ISourceElementCallbackDelegate#enterScope(org.eclipse.cdt.core.parser.ISourceElementRequestor)
     */
    public void enterScope(ISourceElementRequestor requestor)
    {
        // TODO Auto-generated method stub
    }
    /* (non-Javadoc)
     * @see org.eclipse.cdt.core.parser.ISourceElementCallbackDelegate#exitScope(org.eclipse.cdt.core.parser.ISourceElementRequestor)
     */
    public void exitScope(ISourceElementRequestor requestor)
    {
        // TODO Auto-generated method stub
    }
    /* (non-Javadoc)
     * @see org.eclipse.cdt.core.parser.ast.IASTOffsetableElement#setStartingOffset(int)
     */
    public void setStartingOffset(int o)
    {
        // TODO Auto-generated method stub
    }
    /* (non-Javadoc)
     * @see org.eclipse.cdt.core.parser.ast.IASTOffsetableElement#setEndingOffset(int)
     */
    public void setEndingOffset(int o)
    {
        // TODO Auto-generated method stub
    }
    /* (non-Javadoc)
     * @see org.eclipse.cdt.core.parser.ast.IASTOffsetableElement#getStartingOffset()
     */
    public int getStartingOffset()
    {
        // TODO Auto-generated method stub
        return 0;
    }
    /* (non-Javadoc)
     * @see org.eclipse.cdt.core.parser.ast.IASTOffsetableElement#getEndingOffset()
     */
    public int getEndingOffset()
    {
        // TODO Auto-generated method stub
        return 0;
    }
}
