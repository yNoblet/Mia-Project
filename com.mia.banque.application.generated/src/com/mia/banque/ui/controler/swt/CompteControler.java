package com.mia.banque.ui.controler.swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Group;

import com.mia.banque.ui.controler.ICompteControler;
import com.mia.banque.ui.view.ICompteView;
import com.mia.banque.ui.view.swt.CompteView;
import com.mia.banque.model.ICompte;

public class CompteControler implements ICompteControler {

	private CompteView view;
	private ICompte model;
	
	
	public CompteControler(com.mia.banque.model.ICompte model) {
		this.model = model;
	}
	
	public void initView() {
		Display display = Display.getDefault();

		this.view = new CompteView(display, this.model, this);
		this.view.open();
		this.view.layout();
		
		while (!this.view.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}

	}
	
	public void afficherOperation(){
// Start of user code for afficherOperation

// End of user code for afficherOperation
	}
	public void quitter(){
// Start of user code for quitter

// End of user code for quitter
	}
	
}