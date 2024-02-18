package com.company.sample2.view.inspection

import com.company.sample2.entity.Inspection
import com.company.sample2.view.main.MainView
import com.vaadin.flow.router.Route
import io.jmix.flowui.view.*

@Route(value = "inspections/:id", layout = MainView::class)
@ViewController("Inspection.detail")
@ViewDescriptor("inspection-detail-view.xml")
@EditedEntityContainer("inspectionDc")
class InspectionDetailView : StandardDetailView<Inspection>() {
}
