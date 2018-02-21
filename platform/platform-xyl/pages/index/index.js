const util = require('../../utils/util.js');
const api = require('../../config/api.js');
const user = require('../../services/user.js');

//获取应用实例
const app = getApp()
Page({
  data: {     
    alumniList: [],
    banner: []
   
  },
  onShareAppMessage: function () {
    return {
      title: 'dada',
      desc: '嗒嗒校友录分享',
      path: '/pages/index/index'
    }
  },

  getIndexData: function () {
    let that = this;
    util.request(api.IndexUrl).then(function (res) {
      if (res.errno === 0) {
        that.setData({         
          alumniList: res.data.alumniList,
          banner: res.data.banner        
        });
      }
    });
  },
  getIndexDataTest: function(){
    this.setData({
      banner: [{ id: '1', image_url: 'http://img4.imgtn.bdimg.com/it/u=3647692999,691655224&fm=214&gp=0.jpg', link: '' }, { id: '2', image_url: 'http://img.jiqie.com/11/4/1481od.jpg', link: ''}],
      alumniList: [{ id: '1', name: '艾爽', classList: [{ id: '1', name: '科学院子校', studentsTotal: '44', list_pic_url: 'http://img1.imgtn.bdimg.com/it/u=970273626,898299567&fm=214&gp=0.jpg' }, { id: '2', name: '市7中', studentsTotal: '34', list_pic_url: 'http://www.wzfzl.cn/uploads/allimg/170207/13554Bc9-10.jpg' }, { id: '3', name: '上海大学', studentsTotal: '34', list_pic_url: 'http://img.zcool.cn/community/0168e059b9e172a80120753452a30f.jpg@2o.jpg' }, { id: '4', name: '上海大学', studentsTotal: '24', list_pic_url: 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1518868730721&di=b84ac9f4a502500e720d20746c4e169c&imgtype=0&src=http%3A%2F%2Fimgsrc.baidu.com%2Fimage%2Fc0%253Dpixel_huitu%252C0%252C0%252C294%252C40%2Fsign%3D2186becd5ada81cb5aeb8b8d3b1eb57a%2Ff636afc379310a553ff188cdbc4543a982261035.jpg' }]}]

    });
  },
  onLoad: function (options) {
    // this.getIndexData();
    this.getIndexDataTest();
  },
  onReady: function () {
    // 页面渲染完成
  },
  onShow: function () {
    // 页面显示
  },
  onHide: function () {
    // 页面隐藏
  },
  onUnload: function () {
    // 页面关闭
  },
})
