$(function(){
	//已有物品数据格式化
	$('#dataTables-example').dataTable();
	//单位上传
	$('#unit_add_submit').click(function(){
		var content = {
				unitName:$('#unit_add_unitName').val()
		};
		$.ajax({
			type:'POST',
			url:'/goods_database/unit_add',
			dataType:'json',
			contentType:'application/json;charset=utf-8',
			data:JSON.stringify(content),
			success:function(data){
				alert("yes");
			},
			error:function(data){
				alert("no");
			}
		});
	});
	//品牌上传
	$('#branch_add_submit').click(function(){
		var content = {
				branchName:$('#branch_add_branchName').val()
		};
		$.ajax({
			type:'POST',
			url:'/goods_database/branch_add',
			dataType:'json',
			contentType:'application/json;charset=utf-8',
			data:JSON.stringify(content),
			success:function(data){
				alert("yes");
			},
			error:function(data){
				alert("no");
			}
		});
	});
	//分类上传
	$('#category_add_submit').click(function(){
		var content = {
				name:$('#category_add_categoryName').val()
		};
		$.ajax({
			type:'POST',
			url:'/goods_database/category_add',
			dataType:'json',
			contentType:'application/json;charset=utf-8',
			data:JSON.stringify(content),
			success:function(data){
				alert("yes");
			},
			error:function(data){
				alert("no");
			}
		});
	});
})