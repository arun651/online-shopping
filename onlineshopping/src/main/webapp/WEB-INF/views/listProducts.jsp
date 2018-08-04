<div class="container">
	<div class="row">
		<!-- Display the sidebar -->
		<div class="col-md-3">
			<%@include file="./shared/sidebar.jsp"%>
		</div>


		<!-- Display the product details -->
		<div class="col-md-9">
			<!-- Adding bootstrap breadcrumb component -->
			<div class="row">
				<ol class="breadcrumb">
					<li><a href="${contextRoot}/home">Home</a></li>
					<c:if test="${userClickAllProducts == true}">
						<li class="active">All Products</li>
					</c:if>
					<c:if test="${userClickCategoryProducts == true}">
						<li class="active">Category</li>
						<li class="active">${category.name}</li>
					</c:if>


				</ol>
			</div>
		</div>
	</div>
</div>