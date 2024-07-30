import axios from "axios"

// import * as replyApi from '../apis/replyApi';

export const getReplyList=(boardNum)=>{
  const reponse=axios.get(`/reply/list/${boardNum}`);
  return reponse;
}