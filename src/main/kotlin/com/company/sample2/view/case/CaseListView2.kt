package com.company.sample2.view.case

import com.company.sample2.entity.Case
import com.company.sample2.view.main.MainView
import com.vaadin.flow.router.Route
import io.jmix.flowui.view.*

@Route(value = "cases2", layout = MainView::class)
@ViewController("Case_.list_2")
@ViewDescriptor("case-list-view-2.xml")
@LookupComponent("casesDataGrid")
@DialogMode(width = "64em")
class CaseListView2 : StandardListView<Case>() {
}
