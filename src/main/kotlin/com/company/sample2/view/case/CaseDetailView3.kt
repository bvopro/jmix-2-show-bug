package com.company.sample2.view.case

import com.company.sample2.entity.Case
import com.company.sample2.view.main.MainView
import com.vaadin.flow.router.Route
import io.jmix.flowui.view.*

@Route(value = "cases3/:id", layout = MainView::class)
@ViewController("Case_.detail_3")
@ViewDescriptor("case-detail-view-3.xml")
@EditedEntityContainer("caseDc")
class CaseDetailView3 : StandardDetailView<Case>() {
}
