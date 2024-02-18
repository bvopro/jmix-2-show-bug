package com.company.sample2.view.inspection

import com.company.sample2.entity.Inspection
import com.company.sample2.view.main.MainView
import com.vaadin.flow.router.Route
import io.jmix.flowui.view.*

@Route(value = "inspections", layout = MainView::class)
@ViewController("Inspection.list")
@ViewDescriptor("inspection-list-view.xml")
@LookupComponent("inspectionsDataGrid")
@DialogMode(width = "64em")
class InspectionListView : StandardListView<Inspection>() {
}
