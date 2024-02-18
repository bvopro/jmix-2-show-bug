package com.company.sample2.view.invoice

import com.company.sample2.entity.Invoice
import com.company.sample2.view.main.MainView
import com.vaadin.flow.router.Route
import io.jmix.flowui.view.*

@Route(value = "invoices", layout = MainView::class)
@ViewController("Invoice.list")
@ViewDescriptor("invoice-list-view.xml")
@LookupComponent("invoicesDataGrid")
@DialogMode(width = "64em")
class InvoiceListView : StandardListView<Invoice>() {
}
