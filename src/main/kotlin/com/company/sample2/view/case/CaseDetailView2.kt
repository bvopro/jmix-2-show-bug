package com.company.sample2.view.case

import com.company.sample2.entity.Case
import com.company.sample2.view.main.MainView
import com.vaadin.flow.router.Route
import io.jmix.flowui.view.*

@Route(value = "cases2/:id", layout = MainView::class)
@ViewController("Case_.detail_2")
@ViewDescriptor("case-detail-view-2.xml")
@EditedEntityContainer("caseDc")
class CaseDetailView2 : StandardDetailView<Case>() {
}
