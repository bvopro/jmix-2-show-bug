package com.company.sample2.view.case

import com.company.sample2.entity.Case
import com.company.sample2.view.main.MainView
import com.vaadin.flow.router.Route
import io.jmix.flowui.view.*

@Route(value = "cases1/:id", layout = MainView::class)
@ViewController("Case_.detail_1")
@ViewDescriptor("case-detail-view-1.xml")
@EditedEntityContainer("caseDc")
class CaseDetailView1 : StandardDetailView<Case>() {
}
