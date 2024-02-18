package com.company.sample2.view.case

import com.company.sample2.entity.Case
import com.company.sample2.view.main.MainView
import com.vaadin.flow.router.Route
import io.jmix.flowui.view.*

@Route(value = "cases3", layout = MainView::class)
@ViewController("Case_.list_3")
@ViewDescriptor("case-list-view-3.xml")
@LookupComponent("casesDataGrid")
@DialogMode(width = "64em")
class CaseListView3 : StandardListView<Case>() {
}
