<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<div class="super-theme-example">
		<div style="height: 550px;">
			<table id="dgTbItem"></table>
		</div>
		<br />
		<br />
		<!-- <table id="pg" style="width: 300px"></table> -->
		<div id="itemEditWindow" class="easyui-window" title="商品编辑" style="width:80%;height:80%"
   		 data-options="iconCls:'icon-save',modal:true,closed:true,href:'item-edit'"></div>
	</div>
	<script type="text/javascript">
	
		$('#dgTbItem').datagrid({
				url: 'item/getItem',
				fit: true,
				pagination: true,
				fitColumns: true,
				toolbar: [{
					text: '添加',
					iconCls: 'fa fa-plus',
					handler: function() {
						$("#item-add").click();
					}
				}, {
					text: '编辑',
					iconCls: 'fa fa-edit',
					handler: function() {
						var ids = getSelections();
						//判断如果未选定，不执行，提示
						if(ids.length == 0){
							$.messager.alert('提示',"必须选择一个商品");
							return;
						}
						//如果选定多行数据，提示：只能选择一个商品
						if(ids.indexOf(',') > 0){
							$.messager.alert('提示',"只能选择一个商品");
							return;
						}
						$('#itemEditWindow').window({
							onLoad:function(){
								var data = $("#dgTbItem").datagrid("getSelections")[0];
								console.log("onLoad:"+data);
								$("#itemEditForm").form('load',data);
								//将商品描述进行显示
								$.getJSON("item/query/item-desc/" + data.id,function(result){
									if(result.status == 200){
										if(result.data != null)
										itemEditEditor.html(result.data.itemDesc);
									}
								});
								TT.init({
									"pics":data.image,
									"cid":data.cid,
									fun:function(node){}
								});
							}
						}).window('open');
					}
				},{
					text: '删除',
					iconCls: 'fa fa-remove',
					handler: function() {
						var ids = getSelections();
						if(ids.length == 0){
							$.messager.alert('提示',"必须选择一个或多个商品");
							return ;
						}
						
						//提醒是否删除数据
						$.messager.confirm('确认', '您确认想要删除ID为'+ids+'商品吗？', function(r) {
							if(r) {
								//进行post跟服务端交互
								var params = {"ids":ids};
								$.post("/item/delete",params,function(data){
									if(data.status == 200){
										alert("删除成功");
										$("#dgTbItem").datagrid("reload");
									}else{
										alert("删除失败:" + data.msg);
									}
								});
							}
						});
					}
				},{
					text: '上架',
					iconCls: 'fa fa-save',
					handler: function() {}
				},{
					text: '下架',
					iconCls: 'fa fa-save',
					handler: function() {}
				}],

				height: 400,
				columns: [
					[{
						field: 'id',
						title: '商品id',
						width: 100,
						sortable: true,
						align: 'center'
					}, {
						field: 'title',
						title: '标题',
						width: 200,
						sortable: true
					}, {
						field: 'sell_point',
						title: '卖点',
						width: 100,
						sortable: true,
						align: 'center'
					}, {
						field: 'price',
						title: '价格',
						width: 100,
						sortable: true,
						align: 'center',
						formatter:TT.formatPrice
					},  {
						field: 'num',
						title: '库存',
						width: 100,
						sortable: true,
						align: 'center'
					}, {
						field: 'barcode',
						title: '条形码',
						width: 100,
						align: 'right',
						sortable: true,
						align: 'center'
					}, {
						field: 'image',
						title: '图片',
						width: 100,
						align: 'center',
						formatter:function(value,row){
							return "<img src ="+value+" width='100px' height='100px'>"
						}
					},{
						field: 'cid',
						title: '类目',
						width: 100,
						align: 'center'
					},{
						field: 'status',
						title: '状态',
						width: 100,
						align: 'center',
						formatter:TT.formatItemStatus
					},{
						field: 'created',
						title: '创建时间',
						width: 100,
						align: 'center',
						formatter:TT.formatDateTime
					},{
						field: 'updated',
						title: '更新时间',
						width: 100,
						align: 'center',
						formatter:TT.formatDateTime
					}]
				]
			});
		function getSelections(){
			var itemList = $("#dgTbItem");
			var sels = itemList.datagrid("getSelections");
			var ids =[];
			for(var i in sels){
				ids.push(sels[i].id);
			}
			ids = ids.join(",");
			return ids;
		}
		</script>
