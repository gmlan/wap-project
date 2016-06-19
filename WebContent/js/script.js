var table;

$(function(){
	$("#table").hide();
	$("#nodata").hide();
	$("#search").autocomplete({
	      source: function( request, response ) {
	        $.ajax({
	          url: "Search",
	          dataType: "json",
	          data: {
	            q: request.term
	          },
	          success: function(data) {	                
	        	  response(data);
	          }
	        });
	      },
	      minLength: 2,
	      select: function( event, ui ) {
	    	  if(ui.item){
	    		 updateResult("Search?word=" + ui.item.value);
	    	  }
	      },
	      open: function() {
	        $( this ).removeClass( "ui-corner-all" ).addClass( "ui-corner-top" );
	      },
	      close: function() {
	        $( this ).removeClass( "ui-corner-top" ).addClass( "ui-corner-all" );
	      }
	    });
	
	$("#btnSearch").click(function(){
		updateResult("Search?word=" +$("#search").val());
	});
	
	
	$("#search").keypress(function(e){
		if(e.keyCode == 13){
			$("#btnSearch").trigger("click");
		}
	})
})

function updateResult(url){
	 $.get(url)
	  .success(function(data){
		   if(data.length == 0){
			   $("#table_wrapper").hide();
			   $("#nodata").show();
		   }
		   else{
			   $("#table").show();
			   $("#nodata").hide();
		   
			   if(table)
				  table.destroy();
			   		     
			   table = $('#table').DataTable( {				
					"aaData": data,
					"pageLength": 5,
					"aoColumns": [
						{ "mDataProp": "word"	},
						{ "mDataProp": "wordtype" },
						{ "mDataProp": "definition" }		
					]
				} );
		   }
	  })
	  .fail(function(data){
		  alert(data);
	  });
}

















