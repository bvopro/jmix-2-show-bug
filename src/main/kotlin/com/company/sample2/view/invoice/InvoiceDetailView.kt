package com.company.sample2.view.invoice

import com.company.sample2.entity.Invoice
import com.company.sample2.view.main.MainView
import com.vaadin.flow.router.Route
import io.jmix.flowui.view.*

@Route(value = "invoices/:id", layout = MainView::class)
@ViewController("Invoice.detail")
@ViewDescriptor("invoice-detail-view.xml")
@EditedEntityContainer("invoiceDc")
class InvoiceDetailView : StandardDetailView<Invoice>() {
}
